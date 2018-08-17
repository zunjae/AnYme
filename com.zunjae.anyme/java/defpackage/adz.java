package defpackage;

public enum adz implements adl {
    mdf_arrow_drop_down('\ue5c5'),
    mdf_arrow_drop_up('\ue5c7'),
    mdf_expand_less('\ue5ce'),
    mdf_expand_more('\ue5cf'),
    mdf_person('\ue7fd');
    
    private static adm typeface;
    char character;

    private adz(char c) {
        this.character = c;
    }

    public final char getCharacter() {
        return this.character;
    }

    public final String getFormattedName() {
        StringBuilder stringBuilder = new StringBuilder("{");
        stringBuilder.append(name());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String getName() {
        return name();
    }

    public final adm getTypeface() {
        if (typeface == null) {
            typeface = new ady();
        }
        return typeface;
    }
}
