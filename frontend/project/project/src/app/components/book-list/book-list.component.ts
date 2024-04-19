import { Component, OnInit } from '@angular/core';
import { Book } from '../../common/book';
import { BookService } from '../../service/book.service';
import { ActivatedRoute } from '@angular/router';
import { CartItem } from '../../common/cart-item';
import { CartService } from '../../service/cart.service';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

  books: Book[] = [];
  currentCategoryId: string | number | null = '1'; // Default category ID
  searchMode: boolean = false;
  keyword: string | null = null;

  constructor(
    private bookService: BookService,
    private route: ActivatedRoute,
    private cartService: CartService
  ) { }

  ngOnInit() {
    this.route.paramMap.subscribe(() => {
      this.listBooks();
    });
  }

  listBooks() {
    this.searchMode = this.route.snapshot.paramMap.has('keyword');
    if (this.searchMode) {
      this.handleSearchBooks();
    } else {
      this.handleListBooks();
    }
  }

  handleSearchBooks() {
    this.keyword = this.route.snapshot.paramMap.get('keyword');
    this.bookService.searchBooks(this.keyword).subscribe(
      (data) => {
        this.books = data;
      },
      (error) => {
        console.error('Error fetching search results:', error);
        // Handle the error, e.g., show a user-friendly message
      }
    );
  }

  handleListBooks() {
    this.currentCategoryId = this.route.snapshot.paramMap.get('categoryId');
    this.bookService.getBookList(this.currentCategoryId).subscribe(
      (data) => {
        this.books = data;
      },
      (error) => {
        console.error('Error fetching books by category:', error);
        // Handle the error, e.g., show a user-friendly message
      }
    );
  }

  
  
  
  addToCart(product: Book) {
    const cartItem = new CartItem(product);
    this.cartService.addToCart(cartItem);
  }
}
