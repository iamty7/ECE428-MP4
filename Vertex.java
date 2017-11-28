import java.util.ArrayList;
import java.util.List;

public class Vertex<VertexID, VertexValue> {
	
	private VertexID id;
	
	private VertexValue value;
	
	private int supersteps;
	
	private List<Edge> outEdgeList;
	
	private List<Message> messageList;
	
	public Vertex(VertexID id, VertexValue value) {
		this.id = id;
		this.value = value;
		this.supersteps = 0;
		this.outEdgeList = new ArrayList<>();
		this.messageList = new ArrayList<>();
	}
	
	public VertexID getVertex_id() {
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
	

	
	// abstract methods
	
	public void compute(List messageList){
		
	}
	
	
	
	public static void main(String[] args) {

	}

}
