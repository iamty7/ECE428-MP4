import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Vertex<VertexValue, MessageValue, EdgeValue> {
	
	private int id;
	
	private VertexValue value;
	
	private int supersteps;
	
	private List<Edge> outEdgeList;
	
	private Queue<Message> messageList;
	
	public Vertex(int id, VertexValue value) {
		this.id = id;
		this.value = value;
		this.supersteps = 0;
		this.outEdgeList = new ArrayList<>();
		this.messageList = new LinkedList<>();
	}
	
	public int getVertex_id() {
		return this.id;
	}
	
	public VertexValue getValue() {
		return this.value;
	}
	
	public void setValue(VertexValue newValue){
		this.value = newValue;
	}
	
	public void addSuperstep(){
		this.supersteps++;
	}
	
	public int getSuperStep(){
		return this.supersteps;
	}
	
	public void addOutEdge(Edge edge){
		this.outEdgeList.add(edge);
	}
	
	public void addMessage(Message message){
		this.messageList.offer(message);
	}
	

	
	
	// abstract methods
	
	public void sendMessageToNei(int target_vertex_id, MessageValue message_value){
		
	}


	public boolean compute(){
		return false;
	}
	
	
	
//	public static void main(String[] args) {
//	
//	}
	
}
