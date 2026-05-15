package k0;

import java.util.Map;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;

/* JADX INFO: renamed from: k0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1124a implements Map.Entry, InterfaceC1237a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13966o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f13967p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f13968q;

    public /* synthetic */ C1124a(Object obj, int i7, Object obj2) {
        this.f13966o = i7;
        this.f13967p = obj;
        this.f13968q = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f13966o) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && AbstractC1209k.a(entry.getKey(), this.f13967p) && AbstractC1209k.a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f13966o) {
        }
        return this.f13967p;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f13966o) {
        }
        return this.f13968q;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f13966o) {
            case 0:
                Object obj = this.f13967p;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f13966o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f13966o) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f13967p);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
