package p0;

import java.util.ConcurrentModificationException;
import java.util.Map;
import m5.AbstractC1209k;
import n5.InterfaceC1240d;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Map.Entry, InterfaceC1240d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f14983o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f14984p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x f14985q;

    public w(x xVar) {
        this.f14985q = xVar;
        Map.Entry entry = xVar.f14989r;
        AbstractC1209k.c(entry);
        this.f14983o = entry.getKey();
        Map.Entry entry2 = xVar.f14989r;
        AbstractC1209k.c(entry2);
        this.f14984p = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f14983o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f14984p;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        x xVar = this.f14985q;
        if (xVar.f14986o.f().f14956d != xVar.f14988q) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f14984p;
        xVar.f14986o.put(this.f14983o, obj);
        this.f14984p = obj;
        return obj2;
    }
}
