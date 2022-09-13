import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;

public class RuneLiteIterableLinkDeque implements Iterator {
	@Export("linkDeque")
	public final LinkDeque linkDeque;
	@Export("link")
	public Link link;

	public RuneLiteIterableLinkDeque(LinkDeque var1) {
		this.linkDeque = var1;
		this.link = this.linkDeque.field4174.field4495;
	}

	@Export("hasNext")
	public boolean hasNext() {
		return this.link != this.linkDeque.field4174;
	}

	@Export("next")
	public class370 next() {
		if (this.link == this.linkDeque.field4174) {
			throw new NoSuchElementException();
		} else {
			class370 var1 = (class370)this.link;
			this.link = this.link.field4495;
			return var1;
		}
	}

	@Export("remove")
	public void remove() {
		Link var1 = this.link.field4494;
		if (var1 == this.linkDeque.field4174) {
			throw new IllegalStateException();
		} else {
			var1.method7333();
		}
	}
}
