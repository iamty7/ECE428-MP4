import java.util.List;

public class PageRankVertex extends Vertex<Double, Double, Void> {
	
	
	public PageRankVertex(int vertex_id, Double vertex_value) {
		super(vertex_id, vertex_value);
	}
	
	@Override
	public void sendMessageToNei(int target_vertex_id, Double message_value){
		
	}
	
	
	@Override
	public boolean compute(){
		return false;
	}
	

}
