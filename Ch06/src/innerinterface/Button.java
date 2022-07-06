package innerinterface;

public class Button {
	
	OnClickListener listener; //인터페이스형 필드
	
	public void setListner(OnClickListener listener) {
		this.listener = listener;
	}
	public void touch() {
		listener.onClick();
	}
	
	
	
	
	
	
	
	
	
	
	//내부 인터페이스
	static interface OnClickListener {
		public void onClick();
	}
}
