import { Component } from '@angular/core';
import { BookCategory } from '../../common/book-category';
import { BookService } from '../../service/book.service';

@Component({
  selector: 'app-book-category-menu',
  templateUrl: './book-category-menu.component.html',
  styleUrl: './book-category-menu.component.css'
})
export class BookCategoryMenuComponent {
  bookCategories: BookCategory[];

  constructor(private bookService: BookService) { }

  ngOnInit() {
    this.listBookCategories();
  }

  listBookCategories() {
    this.bookService.getBookCategories().subscribe((data) => {
      this.bookCategories = data;

    })
  }

}
