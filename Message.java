
public class Message<MessageValue> {

	private MessageValue value;
	
	public Message(MessageValue value) {
		this.value = value;
	}
	
	public MessageValue getValue() {
		return this.value;
	}
}
