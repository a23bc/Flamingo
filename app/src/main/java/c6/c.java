package c6;

import java.util.regex.Pattern;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f10690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f10691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f10692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f10693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f10694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f10695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f10696g;
    public static final Pattern h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f10697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f10698j;

    static {
        Pattern patternCompile = Pattern.compile("([\\p{InHiragana}\\p{InKatakana}\\p{InBopomofo}\\p{InCJKCompatibilityIdeographs}\\p{InCJKUnifiedIdeographs}])([a-z0-9`~@$%^&*\\-_+=|\\\\/])", 2);
        AbstractC1209k.e(patternCompile, "compile(...)");
        f10690a = patternCompile;
        Pattern patternCompile2 = Pattern.compile("([a-z0-9`~!$%^&*\\-_+=|\\\\;:,./?])([\\p{InHiragana}\\p{InKatakana}\\p{InBopomofo}\\p{InCJKCompatibilityIdeographs}\\p{InCJKUnifiedIdeographs}])", 2);
        AbstractC1209k.e(patternCompile2, "compile(...)");
        f10691b = patternCompile2;
        Pattern patternCompile3 = Pattern.compile("([\\p{InHiragana}\\p{InKatakana}\\p{InBopomofo}\\p{InCJKCompatibilityIdeographs}\\p{InCJKUnifiedIdeographs}])([\"'])");
        AbstractC1209k.e(patternCompile3, "compile(...)");
        f10692c = patternCompile3;
        Pattern patternCompile4 = Pattern.compile("([\"'])([\\p{InHiragana}\\p{InKatakana}\\p{InBopomofo}\\p{InCJKCompatibilityIdeographs}\\p{InCJKUnifiedIdeographs}])");
        AbstractC1209k.e(patternCompile4, "compile(...)");
        f10693d = patternCompile4;
        Pattern patternCompile5 = Pattern.compile("([\\p{InHiragana}\\p{InKatakana}\\p{InBopomofo}\\p{InCJKCompatibilityIdeographs}\\p{InCJKUnifiedIdeographs}])([({\\[]+(.*?)[)}\\]]+)([\\p{InHiragana}\\p{InKatakana}\\p{InBopomofo}\\p{InCJKCompatibilityIdeographs}\\p{InCJKUnifiedIdeographs}])");
        AbstractC1209k.e(patternCompile5, "compile(...)");
        f10694e = patternCompile5;
        Pattern patternCompile6 = Pattern.compile("([\\p{InHiragana}\\p{InKatakana}\\p{InBopomofo}\\p{InCJKCompatibilityIdeographs}\\p{InCJKUnifiedIdeographs}])([(){}\\[\\]<>])");
        AbstractC1209k.e(patternCompile6, "compile(...)");
        f10695f = patternCompile6;
        Pattern patternCompile7 = Pattern.compile("([(){}\\[\\]<>])([\\p{InHiragana}\\p{InKatakana}\\p{InBopomofo}\\p{InCJKCompatibilityIdeographs}\\p{InCJKUnifiedIdeographs}])");
        AbstractC1209k.e(patternCompile7, "compile(...)");
        f10696g = patternCompile7;
        Pattern patternCompile8 = Pattern.compile("([({\\[)]+)(\\s*)(.+?)(\\s*)([)}\\]]+)");
        AbstractC1209k.e(patternCompile8, "compile(...)");
        h = patternCompile8;
        Pattern patternCompile9 = Pattern.compile("([\\p{InHiragana}\\p{InKatakana}\\p{InBopomofo}\\p{InCJKCompatibilityIdeographs}\\p{InCJKUnifiedIdeographs}])(#(\\S+))");
        AbstractC1209k.e(patternCompile9, "compile(...)");
        f10697i = patternCompile9;
        Pattern patternCompile10 = Pattern.compile("((\\S+)#)([\\p{InHiragana}\\p{InKatakana}\\p{InBopomofo}\\p{InCJKCompatibilityIdeographs}\\p{InCJKUnifiedIdeographs}])");
        AbstractC1209k.e(patternCompile10, "compile(...)");
        f10698j = patternCompile10;
    }
}
