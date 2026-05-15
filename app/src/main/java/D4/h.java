package D4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import w.AbstractC1676i;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f1575p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CharSequence f1576q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f1577r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1579t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ A.b f1580u;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1574o = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1578s = 0;

    public h(A.b bVar, i iVar, CharSequence charSequence) {
        this.f1580u = bVar;
        this.f1577r = (c) iVar.f1583q;
        this.f1579t = iVar.f1582p;
        this.f1576q = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int i7 = this.f1574o;
        if (i7 == 4) {
            throw new IllegalStateException();
        }
        int iB = AbstractC1676i.b(i7);
        if (iB == 0) {
            return true;
        }
        if (iB == 2) {
            return false;
        }
        this.f1574o = 4;
        int i8 = this.f1578s;
        while (true) {
            int length = this.f1578s;
            if (length == -1) {
                this.f1574o = 3;
                string = null;
                break;
            }
            b bVar = (b) this.f1580u.f3p;
            CharSequence charSequence = this.f1576q;
            int length2 = charSequence.length();
            N5.d.s(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (bVar.a(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = charSequence.length();
                this.f1578s = -1;
            } else {
                this.f1578s = length + 1;
            }
            int i9 = this.f1578s;
            if (i9 == i8) {
                int i10 = i9 + 1;
                this.f1578s = i10;
                if (i10 > charSequence.length()) {
                    this.f1578s = -1;
                }
            } else {
                c cVar = this.f1577r;
                if (i8 < length) {
                    charSequence.charAt(i8);
                    cVar.getClass();
                }
                if (length > i8) {
                    charSequence.charAt(length - 1);
                    cVar.getClass();
                }
                int i11 = this.f1579t;
                if (i11 == 1) {
                    length = charSequence.length();
                    this.f1578s = -1;
                    if (length > i8) {
                        charSequence.charAt(length - 1);
                        cVar.getClass();
                    }
                } else {
                    this.f1579t = i11 - 1;
                }
                string = charSequence.subSequence(i8, length).toString();
            }
        }
        this.f1575p = string;
        if (this.f1574o == 3) {
            return false;
        }
        this.f1574o = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1574o = 2;
        String str = this.f1575p;
        this.f1575p = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
