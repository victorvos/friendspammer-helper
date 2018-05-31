package nl.hu.sie.bep.friendspammer;

import com.mongodb.MongoCredential;

class MongoConfig {

    private static String database = "hu-bep-friendspammer";

    private MongoConfig() {
        throw new IllegalStateException("This is a Config class");
    }

    static MongoCredential getMongoCredential() {
        String userName = "victor";
        String password = "N!Mbus67";
        return MongoCredential.createCredential(userName, database, password.toCharArray());
    }

    static String getDatabase(){
        return database;
    }
}
