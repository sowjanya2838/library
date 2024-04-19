import { Book } from "./book";

export class CartItem {
    id: number
    name: string
    imageUrl: string
    unitprice: number;
    quantity: number;

    constructor(book: Book) {
        this.id = book.bookId;
        this.name = book.bookName;
        this.imageUrl = book.imageUrl;
        this.quantity = 1;
    }
}
