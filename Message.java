import java.io.Serializable;

public class Message<MessageValue> implements Serializable {

	private String messageType;
	private MessageValue value;
	private int superstep;
	private int targetVertexID;
	private String app;
	private String filename;
	private String masterHostname;
	private boolean changed;
	//private String sender;
	
	//next round
	public Message(String messageType){
		this.messageType = messageType;
	}

	// worker report
	public Message(String messageType, boolean changed){
		this.messageType = messageType;
		this.changed = changed;
	}
	
	// start a task, start workers
	public Message(String messageType, String app, String filename){
		this.messageType = messageType;
		this.app = app;
		this.filename = filename;
	}
	

	// neighbor message
	public Message(String messageType, MessageValue value, int targetVertex, int superstep) {
		this.messageType = messageType;
		this.value = value;
		this.targetVertexID = targetVertex;
	}
	
	
	public MessageValue getValue() {
		return this.value;
	}
	
	public int getSuperstep() {
		return this.superstep;
	}
	
	public int getTargetVertexID(){
		return this.targetVertexID;
	}
	
	public String getMessageType(){
		return this.messageType;
	}
	
	public String getApp(){
		return this.app;
	}
	
	public String getFilename(){
		return this.filename;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	
	public void setMasterHostname(String hostname){
		this.masterHostname = hostname;
	}
	
	public String getMasterHostname(){
		return this.masterHostname;
	}
}
