import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { CartDetailsComponent } from './components/cart-details/cart-details.component';
import { AboutusComponent } from './components/aboutus/aboutus.component';
import { ContactusComponent } from './components/contactus/contactus.component';
import { UserpageComponent } from './components/userpage/userpage.component';
import { BookListComponent } from './components/book-list/book-list.component';
import { BookDetailsComponent } from './components/book-details/book-details.component';
import { BookCategoryMenuComponent } from './components/book-category-menu/book-category-menu.component';
import { HomepageComponent } from './components/homepage/homepage.component';
import { SigninComponent } from './components/signin/signin.component';
import { SignupComponent } from './components/signup/signup.component';
import { CheckoutComponent } from './components/checkout/checkout.component';



const routes: Routes = [
  { path: 'homepage', component: HomepageComponent },
  { path: 'checkout', component: CheckoutComponent },
  { path: 'signin', component: SigninComponent },
  { path: 'signup', component: SignupComponent },
  { path: 'cart-details', component: CartDetailsComponent },
  { path: 'books/:id', component: BookDetailsComponent },
  { path: 'Book', component: BookListComponent },
  { path: 'search/:keyword', component: BookListComponent },
  { path: 'BookCategory', component: BookCategoryMenuComponent },
  { path: 'category/:categoryId', component: BookListComponent },
  { path: 'details', component: BookDetailsComponent },
  { path: 'userpage', component: UserpageComponent },
  { path: 'contactus', component: ContactusComponent },
  { path: 'aboutus', component: AboutusComponent },
  { path: '', redirectTo: '/homepage', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
