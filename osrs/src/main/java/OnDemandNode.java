public class OnDemandNode extends CacheableNode {

	public int type;
	public int id;
	public int cyclesSinceSend;
	public byte[] buffer;
	public boolean immediate = true;
}
