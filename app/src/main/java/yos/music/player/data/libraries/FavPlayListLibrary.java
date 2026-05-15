package yos.music.player.data.libraries;

import Z4.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m5.AbstractC1209k;
import s5.InterfaceC1438c;
import w4.d;

/* JADX INFO: loaded from: classes.dex */
public final class FavPlayListLibrary {
    static final /* synthetic */ InterfaceC1438c[] $$delegatedProperties;
    public static final FavPlayListLibrary INSTANCE;
    private static final d favPlayList$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Y4.j] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    static {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yos.music.player.data.libraries.FavPlayListLibrary.<clinit>():void");
    }

    private FavPlayListLibrary() {
    }

    private final void setFavPlayList(List<YosMediaItem> list) {
        favPlayList$delegate.d($$delegatedProperties[0], list);
    }

    public final void addMusic(YosMediaItem yosMediaItem) {
        AbstractC1209k.f(yosMediaItem, "music");
        List<YosMediaItem> favPlayList = getFavPlayList();
        if (!(favPlayList instanceof Collection) || !favPlayList.isEmpty()) {
            Iterator<T> it = favPlayList.iterator();
            while (it.hasNext()) {
                if (AbstractC1209k.a(((YosMediaItem) it.next()).getUri(), yosMediaItem.getUri())) {
                    return;
                }
            }
        }
        setFavPlayList(n.C0(getFavPlayList(), yosMediaItem));
    }

    public final List<YosMediaItem> getFavPlayList() {
        return favPlayList$delegate.c($$delegatedProperties[0]);
    }

    public final boolean isFavorite(YosMediaItem yosMediaItem) {
        AbstractC1209k.f(yosMediaItem, "music");
        List<YosMediaItem> favPlayList = getFavPlayList();
        if ((favPlayList instanceof Collection) && favPlayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = favPlayList.iterator();
        while (it.hasNext()) {
            if (AbstractC1209k.a(((YosMediaItem) it.next()).getUri(), yosMediaItem.getUri())) {
                return true;
            }
        }
        return false;
    }

    public final void removeMusic(YosMediaItem yosMediaItem) {
        AbstractC1209k.f(yosMediaItem, "music");
        setFavPlayList(n.A0(getFavPlayList(), yosMediaItem));
    }
}
