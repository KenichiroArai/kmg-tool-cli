package kmg.tool.cli.cmn.infrastructure.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * KMGツールCLI一般メッセージの種類のテスト<br>
 * <p>
 * Genは、Generalの略。<br>
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
public class KmgToolCliGenMsgTypesTest {

    /**
     * デフォルトコンストラクタ<br>
     *
     * @since 0.1.1
     */
    public KmgToolCliGenMsgTypesTest() {

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
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.NONE;

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
     * コンストラクタのテスト - 正常系:KMGTOOLCLI_GEN09000のコンストラクタの実行
     *
     * @since 0.1.1
     */
    @Test
    public void testConstructor_normalKmgToolCliGen09000() {

        /* 期待値の定義 */
        final String expectedDisplayName = "失敗";
        final String expectedKey         = "KMGTOOLCLI_GEN09000";
        final String expectedValue       = "失敗";
        final String expectedDetail      = "失敗";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN09000;

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
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.get();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * get メソッドのテスト - 正常系:KMGTOOLCLI_GEN09000の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGet_normalKmgToolCliGen09000() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN09000";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN09000;

        /* テスト対象の実行 */
        final String actual = testType.get();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * get メソッドのテスト - 正常系:KMGTOOLCLI_GEN09001の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGet_normalKmgToolCliGen09001() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN09001";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN09001;

        /* テスト対象の実行 */
        final String actual = testType.get();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * get メソッドのテスト - 正常系:KMGTOOLCLI_GEN09002の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGet_normalKmgToolCliGen09002() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN09002";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN09002;

        /* テスト対象の実行 */
        final String actual = testType.get();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * get メソッドのテスト - 正常系:KMGTOOLCLI_GEN12000の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGet_normalKmgToolCliGen12000() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN12000";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN12000;

        /* テスト対象の実行 */
        final String actual = testType.get();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * get メソッドのテスト - 正常系:KMGTOOLCLI_GEN12001の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGet_normalKmgToolCliGen12001() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN12001";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN12001;

        /* テスト対象の実行 */
        final String actual = testType.get();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * get メソッドのテスト - 正常系:KMGTOOLCLI_GEN12002の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGet_normalKmgToolCliGen12002() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN12002";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN12002;

        /* テスト対象の実行 */
        final String actual = testType.get();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * get メソッドのテスト - 正常系:KMGTOOLCLI_GEN13000の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGet_normalKmgToolCliGen13000() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN13000";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN13000;

        /* テスト対象の実行 */
        final String actual = testType.get();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * get メソッドのテスト - 正常系:KMGTOOLCLI_GEN13001の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGet_normalKmgToolCliGen13001() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN13001";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN13001;

        /* テスト対象の実行 */
        final String actual = testType.get();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * get メソッドのテスト - 正常系:KMGTOOLCLI_GEN13002の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGet_normalKmgToolCliGen13002() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN13002";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN13002;

        /* テスト対象の実行 */
        final String actual = testType.get();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * get メソッドのテスト - 正常系:KMGTOOLCLI_GEN13003の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGet_normalKmgToolCliGen13003() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN13003";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN13003;

        /* テスト対象の実行 */
        final String actual = testType.get();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * get メソッドのテスト - 正常系:KMGTOOLCLI_GEN13004の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGet_normalKmgToolCliGen13004() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN13004";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN13004;

        /* テスト対象の実行 */
        final String actual = testType.get();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * get メソッドのテスト - 正常系:KMGTOOLCLI_GEN19000の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGet_normalKmgToolCliGen19000() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN19000";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN19000;

        /* テスト対象の実行 */
        final String actual = testType.get();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * get メソッドのテスト - 正常系:KMGTOOLCLI_GEN19001の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGet_normalKmgToolCliGen19001() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN19001";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN19001;

        /* テスト対象の実行 */
        final String actual = testType.get();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * get メソッドのテスト - 正常系:KMGTOOLCLI_GEN19002の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGet_normalKmgToolCliGen19002() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN19002";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN19002;

        /* テスト対象の実行 */
        final String actual = testType.get();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * get メソッドのテスト - 正常系:KMGTOOLCLI_GEN19003の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGet_normalKmgToolCliGen19003() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN19003";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN19003;

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
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.getCode();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "getCodeの返り値が一致しません");

    }

    /**
     * getCode メソッドのテスト - 正常系:KMGTOOLCLI_GEN09000のコードの取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetCode_normalKmgToolCliGen09000() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN09000";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN09000;

        /* テスト対象の実行 */
        final String actual = testType.getCode();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "getCodeの返り値が一致しません");

    }

    /**
     * getDefault メソッドのテスト - 正常系:デフォルト値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetDefault_normalDefaultValue() {

        /* 期待値の定義 */
        final KmgToolCliGenMsgTypes expected = KmgToolCliGenMsgTypes.NONE;

        /* テスト対象の実行 */
        final KmgToolCliGenMsgTypes actual = KmgToolCliGenMsgTypes.getDefault();

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
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.getDetail();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "詳細情報が一致しません");

    }

    /**
     * getDetail メソッドのテスト - 正常系:KMGTOOLCLI_GEN09000の詳細情報の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetDetail_normalKmgToolCliGen09000() {

        /* 期待値の定義 */
        final String expected = "失敗";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN09000;

        /* テスト対象の実行 */
        final String actual = testType.getDetail();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "詳細情報が一致しません");

    }

    /**
     * getDetail メソッドのテスト - 正常系:KMGTOOLCLI_GEN09001の詳細情報の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetDetail_normalKmgToolCliGen09001() {

        /* 期待値の定義 */
        final String expected = "成功";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN09001;

        /* テスト対象の実行 */
        final String actual = testType.getDetail();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "詳細情報が一致しません");

    }

    /**
     * getDetail メソッドのテスト - 正常系:KMGTOOLCLI_GEN12000の詳細情報の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetDetail_normalKmgToolCliGen12000() {

        /* 期待値の定義 */
        final String expected = "Javadoc行削除の初期化に失敗しました。";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN12000;

        /* テスト対象の実行 */
        final String actual = testType.getDetail();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "詳細情報が一致しません");

    }

    /**
     * getDetail メソッドのテスト - 正常系:KMGTOOLCLI_GEN13000の詳細情報の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetDetail_normalKmgToolCliGen13000() {

        /* 期待値の定義 */
        final String expected = "入力ファイルから対象パスを設定に失敗しました。";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN13000;

        /* テスト対象の実行 */
        final String actual = testType.getDetail();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "詳細情報が一致しません");

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
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.getDisplayName();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "表示名が一致しません");

    }

    /**
     * getDisplayName メソッドのテスト - 正常系:KMGTOOLCLI_GEN09000の表示名の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetDisplayName_normalKmgToolCliGen09000() {

        /* 期待値の定義 */
        final String expected = "失敗";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN09000;

        /* テスト対象の実行 */
        final String actual = testType.getDisplayName();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "表示名が一致しません");

    }

    /**
     * getDisplayName メソッドのテスト - 正常系:KMGTOOLCLI_GEN09001の表示名の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetDisplayName_normalKmgToolCliGen09001() {

        /* 期待値の定義 */
        final String expected = "成功";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN09001;

        /* テスト対象の実行 */
        final String actual = testType.getDisplayName();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "表示名が一致しません");

    }

    /**
     * getEnum メソッドのテスト - 正常系:存在する値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetEnum_normalExistingValue() {

        /* 期待値の定義 */
        final KmgToolCliGenMsgTypes expected = KmgToolCliGenMsgTypes.NONE;

        /* 準備 */
        final String testValue = "NONE";

        /* テスト対象の実行 */
        final KmgToolCliGenMsgTypes actual = KmgToolCliGenMsgTypes.getEnum(testValue);

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "値が一致しません");

    }

    /**
     * getEnum メソッドのテスト - 正常系:KMGTOOLCLI_GEN09000の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetEnum_normalKmgToolCliGen09000() {

        /* 期待値の定義 */
        final KmgToolCliGenMsgTypes expected = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN09000;

        /* 準備 */
        final String testValue = "KMGTOOLCLI_GEN09000";

        /* テスト対象の実行 */
        final KmgToolCliGenMsgTypes actual = KmgToolCliGenMsgTypes.getEnum(testValue);

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "値が一致しません");

    }

    /**
     * getEnum メソッドのテスト - 正常系:KMGTOOLCLI_GEN09001の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetEnum_normalKmgToolCliGen09001() {

        /* 期待値の定義 */
        final KmgToolCliGenMsgTypes expected = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN09001;

        /* 準備 */
        final String testValue = "KMGTOOLCLI_GEN09001";

        /* テスト対象の実行 */
        final KmgToolCliGenMsgTypes actual = KmgToolCliGenMsgTypes.getEnum(testValue);

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "値が一致しません");

    }

    /**
     * getEnum メソッドのテスト - 正常系:KMGTOOLCLI_GEN13001の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetEnum_normalKmgToolCliGen13001() {

        /* 期待値の定義 */
        final KmgToolCliGenMsgTypes expected = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN13001;

        /* 準備 */
        final String testValue = "KMGTOOLCLI_GEN13001";

        /* テスト対象の実行 */
        final KmgToolCliGenMsgTypes actual = KmgToolCliGenMsgTypes.getEnum(testValue);

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "値が一致しません");

    }

    /**
     * getEnum メソッドのテスト - 正常系:KMGTOOLCLI_GEN19001の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetEnum_normalKmgToolCliGen19001() {

        /* 期待値の定義 */
        final KmgToolCliGenMsgTypes expected = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN19001;

        /* 準備 */
        final String testValue = "KMGTOOLCLI_GEN19001";

        /* テスト対象の実行 */
        final KmgToolCliGenMsgTypes actual = KmgToolCliGenMsgTypes.getEnum(testValue);

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "値が一致しません");

    }

    /**
     * getEnum メソッドのテスト - 準正常系:存在しない値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetEnum_semiNonExistingValue() {

        /* 期待値の定義 */
        final KmgToolCliGenMsgTypes expected = KmgToolCliGenMsgTypes.NONE;

        /* 準備 */
        final String testValue = "INVALID";

        /* テスト対象の実行 */
        final KmgToolCliGenMsgTypes actual = KmgToolCliGenMsgTypes.getEnum(testValue);

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
        final KmgToolCliGenMsgTypes expected = KmgToolCliGenMsgTypes.NONE;

        /* テスト対象の実行 */
        final KmgToolCliGenMsgTypes actual = KmgToolCliGenMsgTypes.getInitValue();

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
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.getKey();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * getKey メソッドのテスト - 正常系:KMGTOOLCLI_GEN09000のキーの取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetKey_normalKmgToolCliGen09000() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN09000";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN09000;

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
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.getValue();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "値が一致しません");

    }

    /**
     * getValue メソッドのテスト - 正常系:KMGTOOLCLI_GEN09000の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetValue_normalKmgToolCliGen09000() {

        /* 期待値の定義 */
        final String expected = "失敗";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN09000;

        /* テスト対象の実行 */
        final String actual = testType.getValue();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "値が一致しません");

    }

    /**
     * getValue メソッドのテスト - 正常系:KMGTOOLCLI_GEN09001の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetValue_normalKmgToolCliGen09001() {

        /* 期待値の定義 */
        final String expected = "成功";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN09001;

        /* テスト対象の実行 */
        final String actual = testType.getValue();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "値が一致しません");

    }

    /**
     * getValue メソッドのテスト - 正常系:KMGTOOLCLI_GEN12000の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetValue_normalKmgToolCliGen12000() {

        /* 期待値の定義 */
        final String expected = "Javadoc行削除の初期化に失敗しました。";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN12000;

        /* テスト対象の実行 */
        final String actual = testType.getValue();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "値が一致しません");

    }

    /**
     * getValue メソッドのテスト - 正常系:KMGTOOLCLI_GEN13000の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetValue_normalKmgToolCliGen13000() {

        /* 期待値の定義 */
        final String expected = "入力ファイルから対象パスを設定に失敗しました。";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN13000;

        /* テスト対象の実行 */
        final String actual = testType.getValue();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "値が一致しません");

    }

    /**
     * getValue メソッドのテスト - 正常系:KMGTOOLCLI_GEN19000の値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetValue_normalKmgToolCliGen19000() {

        /* 期待値の定義 */
        final String expected = "入力ファイルから対象パスを設定に失敗しました。";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN19000;

        /* テスト対象の実行 */
        final String actual = testType.getValue();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "値が一致しません");

    }

    /**
     * toString メソッドのテスト - 正常系:KMGTOOLCLI_GEN09000の文字列表現
     *
     * @since 0.1.1
     */
    @Test
    public void testToString_normalKmgToolCliGen09000() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN09000";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN09000;

        /* テスト対象の実行 */
        final String actual = testType.toString();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "KMGTOOLCLI_GEN09000の場合、'KMGTOOLCLI_GEN09000'が返されること");

    }

    /**
     * toString メソッドのテスト - 正常系:KMGTOOLCLI_GEN13001の文字列表現
     *
     * @since 0.1.1
     */
    @Test
    public void testToString_normalKmgToolCliGen13001() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN13001";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN13001;

        /* テスト対象の実行 */
        final String actual = testType.toString();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "KMGTOOLCLI_GEN13001の場合、'KMGTOOLCLI_GEN13001'が返されること");

    }

    /**
     * toString メソッドのテスト - 正常系:KMGTOOLCLI_GEN19001の文字列表現
     *
     * @since 0.1.1
     */
    @Test
    public void testToString_normalKmgToolCliGen19001() {

        /* 期待値の定義 */
        final String expected = "KMGTOOLCLI_GEN19001";

        /* 準備 */
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.KMGTOOLCLI_GEN19001;

        /* テスト対象の実行 */
        final String actual = testType.toString();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "KMGTOOLCLI_GEN19001の場合、'KMGTOOLCLI_GEN19001'が返されること");

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
        final KmgToolCliGenMsgTypes testType = KmgToolCliGenMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.toString();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "NONEの場合、\"NONE\"が返されること");

    }

    /**
     * values メソッドのテスト - 正常系:すべての列挙値を取得
     *
     * @since 0.1.1
     */
    @Test
    public void testValues_normalAllValues() {

        /* 期待値の定義 */
        final int expectedCount = 16;

        /* 準備 */

        /* テスト対象の実行 */
        final KmgToolCliGenMsgTypes[] actualValues = KmgToolCliGenMsgTypes.values();

        /* 検証の準備 */
        final int actualCount = actualValues.length;

        /* 検証の実施 */
        Assertions.assertEquals(expectedCount, actualCount, "列挙値の数が一致しません");

    }

}
