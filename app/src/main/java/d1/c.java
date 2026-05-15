package d1;

import a.AbstractC0509a;
import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0509a {

    /* JADX INFO: renamed from: u */
    public final BreakIterator f11182u;

    public c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f11182u = characterInstance;
    }

    @Override // a.AbstractC0509a
    public final int Q(int i7) {
        return this.f11182u.following(i7);
    }

    @Override // a.AbstractC0509a
    public final int V(int i7) {
        return this.f11182u.preceding(i7);
    }
}
