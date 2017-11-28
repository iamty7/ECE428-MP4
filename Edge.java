
public class Edge<EdgeValue,VertexID, VertexValue> {
	
	
	VertexID source;
	VertexID tagert;
	EdgeValue value;
	
	public Edge(VertexID source, VertexID target, EdgeValue value) {
		this.source = source;
		this.tagert = target;
		this.value = value;
	}
	
	public VertexID getTarget(){
		return this.tagert;
	}
	
	public EdgeValue getValue(){
		return this.value;
	}
	
}
