package model;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javafx.fxml.FXML;
import org.bson.Document;

import java.awt.*;


public class ConnectionMongoDB
{
    @FXML
    private TextField textResult;
    public static void main( String args[] )
    {
        ConnectionMongoDB conect = new ConnectionMongoDB();
    }

    public ConnectionMongoDB(){
        MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017");
        MongoClient mongoClient = new MongoClient(connectionString);
        MongoDatabase database = mongoClient.getDatabase("projet");

        MongoCollection<Document> collection = database.getCollection("movies");

        //retourne le nombre de donnée dans notre collection
        System.out.print(collection.count());

        //retourne l'ensemble des movies sorties en 2015
        FindIterable<Document> iterable = collection.find(
                new Document("fields.year", 2015));
        iterable.forEach(new Block<Document>() {
            public void apply(final Document document) {
                System.out.println(document);
            }
        });

    }
}
