package br.ufc.persistencia.connection;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoConnection {
	
	private static final MongoClient mongoClient = new MongoClient();
	private static final DB database = mongoClient.getDB("TextePersistence");
	private static MongoConnection CONNECTION;
	
	private MongoConnection() {
		
	}
	
	
	public static MongoConnection getInstance(){
		return CONNECTION == null ? new MongoConnection() : CONNECTION;
	}
	
	
	public MongoClient getMongoclient() {
		return mongoClient;
	}
	public DB getDatabase() {
		return database;
	}

}
