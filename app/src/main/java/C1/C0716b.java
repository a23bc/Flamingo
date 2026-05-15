package c1;

import java.text.CharacterIterator;

/* JADX INFO: renamed from: c1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0716b implements CharacterIterator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CharSequence f10619o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f10620p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10621q = 0;

    public C0716b(CharSequence charSequence, int i7) {
        this.f10619o = charSequence;
        this.f10620p = i7;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i7 = this.f10621q;
        if (i7 == this.f10620p) {
            return (char) 65535;
        }
        return this.f10619o.charAt(i7);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f10621q = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f10620p;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f10621q;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i7 = this.f10620p;
        if (i7 == 0) {
            this.f10621q = i7;
            return (char) 65535;
        }
        int i8 = i7 - 1;
        this.f10621q = i8;
        return this.f10619o.charAt(i8);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i7 = this.f10621q + 1;
        this.f10621q = i7;
        int i8 = this.f10620p;
        if (i7 < i8) {
            return this.f10619o.charAt(i7);
        }
        this.f10621q = i8;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i7 = this.f10621q;
        if (i7 <= 0) {
            return (char) 65535;
        }
        int i8 = i7 - 1;
        this.f10621q = i8;
        return this.f10619o.charAt(i8);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i7) {
        if (i7 > this.f10620p || i7 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f10621q = i7;
        return current();
    }
}
