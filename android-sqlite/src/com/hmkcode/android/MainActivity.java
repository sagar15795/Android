package com.hmkcode.android;

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		MySQLiteHelper db = new MySQLiteHelper(this);
        db.close();
        /**
         * CRUD Operations
         * */
        // add Books
        //db.addBook(new Subject_detail("Android Application Development Cookbook", "Wei Meng Lee"));   
        //db.addBook(new Subject_detail("Android Programming: The Big Nerd Ranch Guide", "Bill Phillips and Brian Hardy"));       
        //db.addBook(new Subject_detail("Learn Android App Development", "Wallace Jackson"));
        
        // get all books
        //List<Subject_detail> list = db.getAllBooks();
        
        // delete one book
        //db.deleteBook(list.get(0));
        
        // get all books
        //db.getAllBooks();

        
	}

}
