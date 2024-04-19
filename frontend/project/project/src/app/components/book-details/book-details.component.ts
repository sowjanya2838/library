import { Component } from '@angular/core';
import { Book } from '../../common/book';
import { BookService } from '../../service/book.service';
import { ActivatedRoute } from '@angular/router';
import { CartItem } from '../../common/cart-item';
import { CartService } from '../../service/cart.service';


@Component({
  selector: 'app-book-details',
  templateUrl: './book-details.component.html',
  styleUrl: './book-details.component.css'
})
export class BookDetailsComponent {


  book: Book = new Book();

  constructor(
    private service: BookService,
    private route: ActivatedRoute,
    private cartService: CartService

  ) { }

  ngOnInit() {
    this.route.paramMap.subscribe(() => {
      this.listBooks();
    })
  }

  listBooks() {
    const thebookId: number | string | null =
      this.route.snapshot.paramMap.get("bookId");
    this.service.getBook(thebookId).subscribe((data) => {
      this.book = data;
    })
  }

  //add to cart
  addToCart(theProdcuct: Book) {
    const theCartItem = new CartItem(theProdcuct);
    this.cartService.addToCart(theCartItem);
  }

}
