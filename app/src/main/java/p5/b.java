package p5;

import java.util.Random;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1298a {

    /* JADX INFO: renamed from: p */
    public final K5.c f15101p = new K5.c(3);

    @Override // p5.AbstractC1298a
    public final Random e() {
        Object obj = this.f15101p.get();
        AbstractC1209k.e(obj, "get(...)");
        return (Random) obj;
    }
}
