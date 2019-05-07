package helloworldmvc.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DAOHelloWorld {
	private String FileName = "chevre.txt";
	private DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
	DAOHelloWorld()
    {
        this.readFile();
    }

	private void readFile() 
    {
        try 
        {
            this.setHelloWorldMessage(Files.readAllLines(Paths.get(this.FileName)).get(0));
        }
        catch(IOException e) 
        {
            e.printStackTrace();
        }
    }
	public String GetHelloWorldMessage() {
		return this.helloWorldMessage;
		
	}
	public void setHelloWorldMessage(String helloWorldMessage) {

	}

	public DAOHelloWorld getInstance() {
		return instance;
	}

	public void setInstance(DAOHelloWorld instance) {
		this.instance = instance;
	}
}