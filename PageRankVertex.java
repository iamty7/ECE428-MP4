import java.util.List;

public class PageRankVertex extends Vertex {
	public PageRankVertex(int vertex_id, int vertex_value) {
		super(vertex_id, vertex_value);
	}
	
	@Override
	public void compute(List messageList){
		
	}
	
	public void sendMessageTo(int target_vertex_id, int message_value){
		
	}
}
