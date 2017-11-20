
class TV {
	private int size;
	private String ip;
	public TV(String ip, int size) { this.size = size; this.ip = ip; }
	protected int getSize() { return size; }
	protected String getIp() { return ip; }
}