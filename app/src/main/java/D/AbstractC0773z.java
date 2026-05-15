package d;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m5.AbstractC1207i;

/* JADX INFO: renamed from: d.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0773z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f10812b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC1207i f10813c;

    public AbstractC0773z(boolean z6) {
        this.f10811a = z6;
    }

    public abstract void a();

    public final void b() {
        Iterator it = this.f10812b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0750c) it.next()).cancel();
        }
    }
}
