package model;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/**
 * Created by Corentin on 03/12/2015.
 */
public class ConnectionMongoDB
{
    public static void main( String args[] )
    {
        MongoClientURI connectionString;
        connectionString = new MongoClientURI("mongodb://localhost:27017");
        MongoClient mongoClient = new MongoClient(connectionString);
    }
}
