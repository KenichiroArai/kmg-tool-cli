package kmg.tool.cli.cmn.infrastructure.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * KMGツールCLIバリデーションメッセージの種類のテスト<br>
 * <p>
 * Valは、Validationの略。<br>
 * Msgは、Messageの略。
 * </p>
 *
 * @author KenichiroArai
 *
 * @since 0.1.1
 *
 * @version 0.1.1
 */
@SuppressWarnings({
    "nls", "static-method"
})
public class KmgToolCliValMsgTypesTest {

    /**
     * デフォルトコンストラクタ<br>
     *
     * @since 0.1.1
     */
    public KmgToolCliValMsgTypesTest() {

        // 処理なし
    }

    /**
     * コンストラクタのテスト - 正常系:コンストラクタの実行
     *
     * @since 0.1.1
     */
    @Test
    public void testConstructor_normalConstructor() {

        /* 期待値の定義 */
        final String expectedDisplayName = "指定無し";
        final String expectedKey         = "NONE";
        final String expectedValue       = "指定無し";
        final String expectedDetail      = "指定無し";

        /* 準備 */
        final KmgToolCliValMsgTypes testType = KmgToolCliValMsgTypes.NONE;

        /* テスト対象の実行 */

        /* 検証の準備 */
        final String actualDisplayName = testType.getDisplayName();
        final String actualKey         = testType.getKey();
        final String actualValue       = testType.getValue();
        final String actualDetail      = testType.getDetail();

        /* 検証の実施 */
        Assertions.assertEquals(expectedDisplayName, actualDisplayName, "表示名が一致しません");
        Assertions.assertEquals(expectedKey, actualKey, "キーが一致しません");
        Assertions.assertEquals(expectedValue, actualValue, "値が一致しません");
        Assertions.assertEquals(expectedDetail, actualDetail, "詳細情報が一致しません");

    }

    /**
     * get メソッドのテスト - 正常系:基本的な値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGet_normalBasicValue() {

        /* 期待値の定義 */
        final String expected = "NONE";

        /* 準備 */
        final KmgToolCliValMsgTypes testType = KmgToolCliValMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.get();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * getCode メソッドのテスト - 正常系:コードの取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetCode_normalBasicCode() {

        /* 期待値の定義 */
        final String expected = "NONE";

        /* 準備 */
        final KmgToolCliValMsgTypes testType = KmgToolCliValMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.getCode();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * getDefault メソッドのテスト - 正常系:デフォルト値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetDefault_normalDefaultValue() {

        /* 期待値の定義 */
        final KmgToolCliValMsgTypes expected = KmgToolCliValMsgTypes.NONE;

        /* テスト対象の実行 */
        final KmgToolCliValMsgTypes actual = KmgToolCliValMsgTypes.getDefault();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "デフォルト値が一致しません");

    }

    /**
     * getDetail メソッドのテスト - 正常系:詳細情報の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetDetail_normalBasicDetail() {

        /* 期待値の定義 */
        final String expected = "指定無し";

        /* 準備 */
        final KmgToolCliValMsgTypes testType = KmgToolCliValMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.getDetail();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * getDisplayName メソッドのテスト - 正常系:表示名の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetDisplayName_normalBasicDisplayName() {

        /* 期待値の定義 */
        final String expected = "指定無し";

        /* 準備 */
        final KmgToolCliValMsgTypes testType = KmgToolCliValMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.getDisplayName();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * getEnum メソッドのテスト - 正常系:存在する値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetEnum_normalExistingValue() {

        /* 期待値の定義 */
        final KmgToolCliValMsgTypes expected = KmgToolCliValMsgTypes.NONE;

        /* 準備 */
        final String key = "NONE";

        /* テスト対象の実行 */
        final KmgToolCliValMsgTypes actual = KmgToolCliValMsgTypes.getEnum(key);

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * getEnum メソッドのテスト - 準正常系:存在しない値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetEnum_semiNonExistingValue() {

        /* 期待値の定義 */
        final KmgToolCliValMsgTypes expected = KmgToolCliValMsgTypes.NONE;

        /* 準備 */
        final String testValue = "INVALID";

        /* テスト対象の実行 */
        final KmgToolCliValMsgTypes actual = KmgToolCliValMsgTypes.getEnum(testValue);

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "値が一致しません");

    }

    /**
     * getInitValue メソッドのテスト - 正常系:初期値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetInitValue_normalInitialValue() {

        /* 期待値の定義 */
        final KmgToolCliValMsgTypes expected = KmgToolCliValMsgTypes.NONE;

        /* テスト対象の実行 */
        final KmgToolCliValMsgTypes actual = KmgToolCliValMsgTypes.getInitValue();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "初期値が一致しません");

    }

    /**
     * getKey メソッドのテスト - 正常系:キーの取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetKey_normalBasicKey() {

        /* 期待値の定義 */
        final String expected = "NONE";

        /* 準備 */
        final KmgToolCliValMsgTypes testType = KmgToolCliValMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.getKey();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * getValue メソッドのテスト - 正常系:値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetValue_normalBasicValue() {

        /* 期待値の定義 */
        final String expected = "指定無し";

        /* 準備 */
        final KmgToolCliValMsgTypes testType = KmgToolCliValMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.getValue();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * toString メソッドのテスト - 正常系:NONEの文字列表現
     *
     * @since 0.1.1
     */
    @Test
    public void testToString_normalNone() {

        /* 期待値の定義 */
        final String expected = "NONE";

        /* 準備 */
        final KmgToolCliValMsgTypes testType = KmgToolCliValMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.toString();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "NONEの場合、\"NONE\"が返されること");

    }

}
