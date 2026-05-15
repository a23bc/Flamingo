package D4;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements f {
    public abstract boolean a(char c7);

    @Override // D4.f
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
