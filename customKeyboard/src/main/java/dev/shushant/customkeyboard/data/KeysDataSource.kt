package dev.shushant.customkeyboard.data

import dev.shushant.customkeyboard.model.Alphabets.A
import dev.shushant.customkeyboard.model.Alphabets.B
import dev.shushant.customkeyboard.model.Alphabets.C
import dev.shushant.customkeyboard.model.Alphabets.D
import dev.shushant.customkeyboard.model.Alphabets.E
import dev.shushant.customkeyboard.model.Alphabets.F
import dev.shushant.customkeyboard.model.Alphabets.G
import dev.shushant.customkeyboard.model.Alphabets.H
import dev.shushant.customkeyboard.model.Alphabets.I
import dev.shushant.customkeyboard.model.Alphabets.J
import dev.shushant.customkeyboard.model.Alphabets.K
import dev.shushant.customkeyboard.model.Alphabets.L
import dev.shushant.customkeyboard.model.Alphabets.M
import dev.shushant.customkeyboard.model.Alphabets.N
import dev.shushant.customkeyboard.model.Alphabets.O
import dev.shushant.customkeyboard.model.Alphabets.P
import dev.shushant.customkeyboard.model.Alphabets.Q
import dev.shushant.customkeyboard.model.Alphabets.R
import dev.shushant.customkeyboard.model.Alphabets.S
import dev.shushant.customkeyboard.model.Alphabets.T
import dev.shushant.customkeyboard.model.Alphabets.U
import dev.shushant.customkeyboard.model.Alphabets.V
import dev.shushant.customkeyboard.model.Alphabets.W
import dev.shushant.customkeyboard.model.Alphabets.X
import dev.shushant.customkeyboard.model.Alphabets.Y
import dev.shushant.customkeyboard.model.Alphabets.Z
import dev.shushant.customkeyboard.model.Digit.Eight
import dev.shushant.customkeyboard.model.Digit.Five
import dev.shushant.customkeyboard.model.Digit.Four
import dev.shushant.customkeyboard.model.Digit.Nine
import dev.shushant.customkeyboard.model.Digit.One
import dev.shushant.customkeyboard.model.Digit.Seven
import dev.shushant.customkeyboard.model.Digit.Six
import dev.shushant.customkeyboard.model.Digit.Three
import dev.shushant.customkeyboard.model.Digit.Two
import dev.shushant.customkeyboard.model.Digit.Zero
import dev.shushant.customkeyboard.model.Key
import dev.shushant.customkeyboard.model.NumericUtilityKey
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Ampersat
import dev.shushant.customkeyboard.model.SpecialCharactersKey.And
import dev.shushant.customkeyboard.model.SpecialCharactersKey.ArrowLeft
import dev.shushant.customkeyboard.model.SpecialCharactersKey.ArrowRight
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Asterisk
import dev.shushant.customkeyboard.model.SpecialCharactersKey.BackSlash
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Backlash
import dev.shushant.customkeyboard.model.SpecialCharactersKey.BoxBracketLeft
import dev.shushant.customkeyboard.model.SpecialCharactersKey.BoxBracketRight
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Bullet
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Caret
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Cent
import dev.shushant.customkeyboard.model.SpecialCharactersKey.CheckMark
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Colon
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Comma
import dev.shushant.customkeyboard.model.SpecialCharactersKey.CopyRight
import dev.shushant.customkeyboard.model.SpecialCharactersKey.CurlyBracketLeft
import dev.shushant.customkeyboard.model.SpecialCharactersKey.CurlyBracketRight
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Dash
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Degree
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Division
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Dollar
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Dot
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Equal
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Euro
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Exclamation
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Grave
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Hash
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Multiple
import dev.shushant.customkeyboard.model.SpecialCharactersKey.PI
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Paragraph
import dev.shushant.customkeyboard.model.SpecialCharactersKey.ParenthesesBracketsLeft
import dev.shushant.customkeyboard.model.SpecialCharactersKey.ParenthesesBracketsRight
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Percent
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Pipe
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Plus
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Pound
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Question
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Quotes
import dev.shushant.customkeyboard.model.SpecialCharactersKey.RegisterTrademark
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Root
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Semicolon
import dev.shushant.customkeyboard.model.SpecialCharactersKey.SingleQuotes
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Tide
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Triangle
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Underscore
import dev.shushant.customkeyboard.model.SpecialCharactersKey.Yen
import dev.shushant.customkeyboard.model.SuggestionKey
import dev.shushant.customkeyboard.model.TextUtilityKey.ABC
import dev.shushant.customkeyboard.model.TextUtilityKey.Numeric
import dev.shushant.customkeyboard.model.TextUtilityKey.SpecialCharacters
import dev.shushant.customkeyboard.model.UtilityKey.ActionArrow
import dev.shushant.customkeyboard.model.UtilityKey.Backspace
import dev.shushant.customkeyboard.model.UtilityKey.Space
import dev.shushant.customkeyboard.model.UtilityKey.Uppercase

object KeysDataSource {
    val normalKeys: List<Key> by lazy { constructNormalKeys() }
    val numericMiniKeys: List<Key> by lazy { constructNumericMiniKeys() }
    val numericKeys: List<Key> by lazy { constructNumericKeys() }
    val specialCharactersKeys: List<Key> by lazy { constructSpecialCharactersKeys() }
    val toggleKeys: List<Key> by lazy { createToggleButtonsList() }
    val emailSuggestions: List<Key> by lazy { createEmailSuggestions() }

    private fun createEmailSuggestions(): List<Key> = SuggestionHandler.emails.map {
        SuggestionKey(it, 3)
    }

    private fun createToggleButtonsList() = mutableListOf<Key>().apply {
        add(Uppercase)
    }

    private fun constructSpecialCharactersKeys() = mutableListOf<Key>().apply {
        // Row one
        add(Tide)
        add(Grave)
        add(Pipe)
        add(Bullet)
        add(Root)
        add(PI)
        add(Division)
        add(Multiple)
        add(Paragraph)
        add(Triangle)

        // Row two
        add(Pound)
        add(Cent)
        add(Euro)
        add(Yen)
        add(Caret)
        add(Degree)
        add(Equal)
        add(CurlyBracketLeft)
        add(CurlyBracketRight)
        add(Backlash)

        // Row three
        add(Numeric)
        add(Percent)
        add(CopyRight)
        add(RegisterTrademark)
        add(CheckMark)
        add(BoxBracketLeft)
        add(BoxBracketRight)
        add(ArrowLeft)
        add(ArrowRight)
        add(NumericUtilityKey.Backspace)

        // Row five
        add(ABC)
        //add(Clear)
        add(Dot)
        add(Space)
        add(Comma)
        add(ActionArrow)
    }

    private fun constructNumericKeys() = mutableListOf<Key>().apply {
        // Row one
        add(One)
        add(Two)
        add(Three)
        add(Four)
        add(Five)
        add(Six)
        add(Seven)
        add(Eight)
        add(Nine)
        add(Zero)

        // Row two
        add(Ampersat)
        add(Hash)
        add(Dollar)
        add(Underscore)
        add(And)
        add(Dash)
        add(Plus)
        add(ParenthesesBracketsLeft)
        add(ParenthesesBracketsRight)
        add(BackSlash)

        // Row three
        add(SpecialCharacters)
        add(Asterisk)
        add(Quotes)
        add(SingleQuotes)
        add(Colon)
        add(Semicolon)
        add(Exclamation)
        add(Question)
        add(Percent)
        add(NumericUtilityKey.Backspace)

        // Row five
        add(ABC)
        //add(Clear)
        add(Underscore)
        add(Space)
        add(Dash)
        add(ActionArrow)
    }

    private fun constructNumericMiniKeys() = mutableListOf<Key>().apply {
        // Row one
        add(One)
        add(Two)
        add(Three)
        add(Dash)

        // Row two
        add(Four)
        add(Five)
        add(Six)
        add(NumericUtilityKey.Space)

        // Row three
        add(Seven)
        add(Eight)
        add(Nine)
        add(NumericUtilityKey.Backspace)

        // Row four
        add(Dot)
        add(Zero)
        add(Comma)
        add(NumericUtilityKey.RightArrow)
    }

    private fun constructNormalKeys() = mutableListOf<Key>().apply {

        // Row two
        add(Q)
        add(W)
        add(E)
        add(R)
        add(T)
        add(Y)
        add(U)
        add(I)
        add(O)
        add(P)

        // Row three
        add(A)
        add(S)
        add(D)
        add(F)
        add(G)
        add(H)
        add(J)
        add(K)
        add(L)
        add(Dot)

        // Row four
        add(Uppercase)
        add(Z)
        add(X)
        add(C)
        add(V)
        add(B)
        add(N)
        add(M)
        add(Comma)
        add(Backspace)

        // Row five
        add(Numeric)
        //add(Clear)
        add(Underscore)
        add(Space)
        add(Dash)
        add(ActionArrow)
    }
}