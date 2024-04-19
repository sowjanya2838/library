import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Book } from '../common/book';
import { BookCategory } from '../common/book-category';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private baseUrl = 'http://localhost:8181/myapp/api/book';
  private categoryUrl = 'http://localhost:8181/myapp/api/bookCategories';

  constructor(private http: HttpClient) { }

  getBookList(categoryId: number | string | null): Observable<Book[]> {
    const categoryUrl = `${this.baseUrl}/booksByBookCategories/${categoryId}`;
    return this.http.get<Book[]>(categoryUrl);
  }

  getBookCategories(): Observable<BookCategory[]> {
    return this.http.get<BookCategory[]>(this.categoryUrl);
  }

  searchBooks(keyword: string | null): Observable<Book[]> {
    const searchUrl = `${this.baseUrl}/search/${keyword}`;
    return this.http.get<Book[]>(searchUrl);
  }

  getBook(bookId: number | string | null): Observable<Book> {
    const bookUrl = `${this.baseUrl}/${bookId}`;
    return this.http.get<Book>(bookUrl);
  }
}
