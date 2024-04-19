import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { SearchComponent } from './components/search/search.component';
import { CartDetailsComponent } from './components/cart-details/cart-details.component';
import { CartStatusComponent } from './components/cart-status/cart-status.component';
import { UserpageComponent } from './components/userpage/userpage.component';
import { ContactusComponent } from './components/contactus/contactus.component';
import { AboutusComponent } from './components/aboutus/aboutus.component';
import { BookListComponent } from './components/book-list/book-list.component';
import { BookCategoryMenuComponent } from './components/book-category-menu/book-category-menu.component';
import { BookDetailsComponent } from './components/book-details/book-details.component';
import { HomepageComponent } from './components/homepage/homepage.component';
import { SigninComponent } from './components/signin/signin.component';
import { SignupComponent } from './components/signup/signup.component';
import { CheckoutComponent } from './components/checkout/checkout.component';






@NgModule({
  declarations: [
    AppComponent,
    BookListComponent,
    BookCategoryMenuComponent,
    SearchComponent,
    BookDetailsComponent,
    CartDetailsComponent,
    CartStatusComponent,
    UserpageComponent,
    ContactusComponent,
    AboutusComponent,
    HomepageComponent,
    SigninComponent,
    SignupComponent,
    CheckoutComponent,
    

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
