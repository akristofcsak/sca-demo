package com.demo;

import com.puppycrawl.tools.checkstyle.api.AbstractCheck;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;

public final class MethodNameCheck extends AbstractCheck {
    @Override
    public int[] getDefaultTokens() {
        return new int[]{TokenTypes.METHOD_DEF};
    }
    @Override
    public int[] getAcceptableTokens() {
        return getDefaultTokens();
    }
    @Override
    public int[] getRequiredTokens() {
        return getDefaultTokens();
    }

    @Override
    public void visitToken(final DetailAST ast) {
        DetailAST nameAST = ast.findFirstToken(TokenTypes.IDENT);
        String name = nameAST.getText();
        if (Character.isUpperCase(name.charAt(0))) {
            int line = nameAST.getLineNo();
            String suffix = "\" beginnt mit einem Großbuchstaben!";
            log(line, "Methodenname \"" + name + suffix);
        }
    }
}
