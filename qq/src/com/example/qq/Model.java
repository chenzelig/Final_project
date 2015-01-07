package com.example.qq;

import com.parse.Parse;
import com.parse.FindCallback;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import android.content.Context;
import android.util.Log;


public class Model {

	// class member
	private static Model instance;
	// private constructor
	private Model(Context context){
		init(context);

	}
	private void init(Context context) {
		Log.d("Model", "Initializing DB ");
		Parse.initialize(context, "8KMQ8IIr0YMbO6XvDAzTzScqRx6GWw8AfZXpDNPn", "LnThP6LbV8VoAp0hocFdh9faFC5s5nMmiV88PS34");
		
		
		


	}
	//public accessor
	public static Model getInstance(Context context){
		if (instance == null) {
			instance = new Model(context);
		}
		return instance;
	}

	


}
