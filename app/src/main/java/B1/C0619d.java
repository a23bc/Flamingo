package b1;

import h1.AbstractC0996a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: b1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0619d implements Appendable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final StringBuilder f9962o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f9963p;

    public C0619d() {
        this.f9962o = new StringBuilder(16);
        new ArrayList();
        this.f9963p = new ArrayList();
        new ArrayList();
    }

    public final void a(C0622g c0622g) {
        StringBuilder sb = this.f9962o;
        int length = sb.length();
        sb.append(c0622g.f9970p);
        List list = c0622g.f9969o;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0620e c0620e = (C0620e) list.get(i7);
                this.f9963p.add(new C0618c(c0620e.f9964a, c0620e.f9965b + length, c0620e.f9966c + length, c0620e.f9967d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C0622g) {
            a((C0622g) charSequence);
            return this;
        }
        this.f9962o.append(charSequence);
        return this;
    }

    public final void b(C0622g c0622g, int i7, int i8) {
        StringBuilder sb = this.f9962o;
        int length = sb.length();
        sb.append((CharSequence) c0622g.f9970p, i7, i8);
        List listA = AbstractC0623h.a(c0622g, i7, i8, null);
        if (listA != null) {
            int size = listA.size();
            for (int i9 = 0; i9 < size; i9++) {
                C0620e c0620e = (C0620e) listA.get(i9);
                this.f9963p.add(new C0618c(c0620e.f9964a, c0620e.f9965b + length, c0620e.f9966c + length, c0620e.f9967d));
            }
        }
    }

    public final C0622g c() {
        StringBuilder sb = this.f9962o;
        String string = sb.toString();
        ArrayList arrayList = this.f9963p;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0618c c0618c = (C0618c) arrayList.get(i7);
            int length = sb.length();
            int i8 = c0618c.f9960c;
            if (i8 != Integer.MIN_VALUE) {
                length = i8;
            }
            if (length == Integer.MIN_VALUE) {
                AbstractC0996a.b("Item.end should be set first");
            }
            arrayList2.add(new C0620e(c0618c.f9958a, c0618c.f9959b, length, c0618c.f9961d));
        }
        return new C0622g(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i7, int i8) {
        if (charSequence instanceof C0622g) {
            b((C0622g) charSequence, i7, i8);
            return this;
        }
        this.f9962o.append(charSequence, i7, i8);
        return this;
    }

    public C0619d(C0622g c0622g) {
        this();
        a(c0622g);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c7) {
        this.f9962o.append(c7);
        return this;
    }
}
