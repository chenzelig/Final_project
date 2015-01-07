package com.example.qq;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.parse.Parse;
import com.parse.FindCallback;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import android.content.Context;
import android.net.ParseException;
import android.util.Log;


public class Model {

	// class member
	private static Model instance;
	Type t;
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

	public void addGame(Game game){
		Log.d("HY","Model addGame"+game);
		//ParseObject newRest=restToJson(rest);
		ParseObject newGame=new ParseObject("Games");
		newGame.put("userid", game.getUserId());
		newGame.put("time", game.getTime());
		newGame.put("gametype", game.getGameType());
		newGame.put("score", game.getScore());
		
			try {
				newGame.save();
			} catch (com.parse.ParseException e) {
				e.printStackTrace();
			}
	}

	public ParseObject gameToJson(Game game){
		ParseObject po = new ParseObject("games");
		po.put("userid", game.getUserId());
		po.put("time", game.getTime());
		po.put("gametype", game.getGameType());
		po.put("score", game.getScore());
		//po.put("rate", (double)rest.getRate());
		return po;
	}

	public ArrayList<Game> getAllGames() throws com.parse.ParseException{
		Log.d("HY", "Model - Getting all Games");
		ArrayList<Game> games = new ArrayList<Game>();
		ParseQuery<ParseObject> query = new ParseQuery<ParseObject>("games");
		try{
			List<ParseObject> objects=query.find() ;
			if(objects!=null){
				Log.d("HY", "Model - Getting all games- done (), objects.size()=" +objects.size() );

				for(ParseObject o: objects){
					games.add(jsonToGame(o));
				}
				Log.d("HY", "Model - after coversion game.size()=" +games.size());
			}
		}
		catch(ParseException e){
			e.printStackTrace();
			Log.e("HY", "Model - query.find() exeption"+e.toString());	
		}
		Log.d("HY", "Model - Getting all games finished" );
		
		return games;
		
	}
	
	public Game jsonToGame(ParseObject p){
		Game game= new Game(p.getString("gametype"),p.getLong("time"),p.getInt("score"),p.getString("userid"));
		Log.d("HY", "Model - jsonToStudent" +game );
		return game;
	}
	
	
}
