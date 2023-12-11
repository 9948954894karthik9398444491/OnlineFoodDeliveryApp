import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Orders } from 'src/app/model/Orders';
import { AdminService } from 'src/app/services/admin.service';
import { CustomerService } from 'src/app/services/customer.service';
import { OrdersService } from 'src/app/services/orders.service';

@Component({
  selector: 'app-customershoworders',
  templateUrl: './customershoworders.component.html',
  styleUrls: ['./customershoworders.component.css']
})
export class CustomershowordersComponent {
  key:any;
  response: any;
  menuService:any
  adminKey:any;
  authRequest: Orders = new Orders();
  deleteId!: number;
  getName!:String;
  getresponseName:any;
 

  admin:boolean=false;
  customer:boolean=false;

  constructor(private jwtService:OrdersService,private admintoken:CustomerService,private route:Router){

    this.menuService=jwtService;
    
      this.admin=true;
      this.customer=false;
    this.key=admintoken.token;
    this.key.subscribe((genToken: any) => {
      this.adminKey = genToken;
      
      this.getall();
    });
    
   }

   public getall(){
    this.accessApi(this.adminKey)
    console.log(this.adminKey);
    
  }

  public accessApi(adminKey: any) {
    console.log('accessApi', adminKey);  
    let response = this.menuService.getAll(adminKey);
    response.subscribe((responseData: any) => {
      if (typeof responseData === 'string') {
        this.response = JSON.parse(responseData); // Parse string to array
        console.log('Response Data:', this.response);
      } else {
        console.log('Unexpected response type:', responseData);
        // Handle unexpected response if necessary
      } 
    });
  }

  delete(id: number) {

    this.jwtService.delete(id, this.adminKey).subscribe((msg: any) => {
      console.log("Deleted " + msg);
    });
  }
  backTocustomerDash(){
    this.route.navigate(['/customerdashboard',this.admintoken.customername]);
  }

}
