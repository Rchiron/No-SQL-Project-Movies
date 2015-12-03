package model;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.BsonDocument;
import org.bson.Document;

import javax.swing.*;
import java.time.temporal.JulianFields;
import java.util.Arrays;
import java.util.Date;



public class ConnectionMongoDB
{
    public static void main( String args[] )
    {
        MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017");
        MongoClient mongoClient = new MongoClient(connectionString);
        MongoDatabase database = mongoClient.getDatabase("projet");

        MongoCollection<Document> collection = database.getCollection("movies");

        FindIterable<Document> iterable = collection.find(
                new Document("fields.year", 2015));
        iterable.forEach(new Block<Document>() {
            @Override
            public void apply(final Document document) {
                System.out.println(document);
            }
        });
    }
}
