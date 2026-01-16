package kmg.tool.cli.cmn.infrastructure.types;

import java.util.HashMap;
import java.util.Map;

import kmg.tool.cli.cmn.infrastructure.msg.KmgToolCliCmnExcMsg;
import kmg.tool.cli.cmn.infrastructure.msg.KmgToolCliCmnGenMsg;

/**
 * KMGツールCLI一般メッセージの種類<br>
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
@SuppressWarnings("nls")
public enum KmgToolCliGenMsgTypes implements KmgToolCliCmnGenMsg, KmgToolCliCmnExcMsg {

    /* 定義：開始 */

    /**
     * 指定無し
     *
     * @since 0.1.1
     */
    NONE("指定無し"),

    /**
     * 失敗
     *
     * @since 0.1.1
     */
    KMGTOOLCLI_GEN09000("失敗"),

    /**
     * 成功
     *
     * @since 0.1.1
     */
    KMGTOOLCLI_GEN09001("成功"),

    /**
     * 例外発生
     *
     * @since 0.1.1
     */
    KMGTOOLCLI_GEN09002("例外発生"),

    /**
     * Javadoc行削除の初期化に失敗しました。
     *
     * @since 0.1.1
     */
    KMGTOOLCLI_GEN12000("Javadoc行削除の初期化に失敗しました。"),

    /**
     * Javadoc行削除が正常に完了しました。
     *
     * @since 0.1.1
     */
    KMGTOOLCLI_GEN12001("Javadoc行削除が正常に完了しました。"),

    /**
     * Javadoc行削除中にエラーが発生しました。
     *
     * @since 0.1.1
     */
    KMGTOOLCLI_GEN12002("Javadoc行削除中にエラーが発生しました。"),

    /**
     * 入力ファイルから対象パスを設定に失敗しました。
     *
     * @since 0.1.1
     */
    KMGTOOLCLI_GEN13000("入力ファイルから対象パスを設定に失敗しました。"),

    /**
     * 実行が成功しました。
     *
     * @since 0.1.1
     */
    KMGTOOLCLI_GEN13001("実行が成功しました。"),

    /**
     * 実行中に例外が発生しました。
     *
     * @since 0.1.1
     */
    KMGTOOLCLI_GEN13002("実行中に例外が発生しました。"),

    /**
     * バリデーションエラーが発生しました。
     *
     * @since 0.1.1
     */
    KMGTOOLCLI_GEN13003("バリデーションエラーが発生しました。"),

    /**
     * 実行時例外が発生しました。
     *
     * @since 0.1.1
     */
    KMGTOOLCLI_GEN13004("実行時例外が発生しました。"),

    /**
     * 入力ファイルから対象パスを設定に失敗しました。
     *
     * @since 0.1.1
     */
    KMGTOOLCLI_GEN19000("入力ファイルから対象パスを設定に失敗しました。"),

    /**
     * 実行が成功しました。
     *
     * @since 0.1.1
     */
    KMGTOOLCLI_GEN19001("実行が成功しました。"),

    /**
     * 実行中に例外が発生しました。
     *
     * @since 0.1.1
     */
    KMGTOOLCLI_GEN19002("実行中に例外が発生しました。"),

    /**
     * バリデーションエラーが発生しました。
     *
     * @since 0.1.1
     */
    KMGTOOLCLI_GEN19003("バリデーションエラーが発生しました。"),

    /* 定義：終了 */

    ;

    /**
     * 種類のマップ
     *
     * @since 0.1.1
     */
    private static final Map<String, KmgToolCliGenMsgTypes> VALUES_MAP = new HashMap<>();

    static {

        /* 種類のマップにプット */
        for (final KmgToolCliGenMsgTypes type : KmgToolCliGenMsgTypes.values()) {

            KmgToolCliGenMsgTypes.VALUES_MAP.put(type.get(), type);

        }

    }

    /**
     * 表示名
     *
     * @since 0.1.1
     */
    private final String displayName;

    /**
     * メッセージのキー
     *
     * @since 0.1.1
     */
    private final String key;

    /**
     * メッセージの値
     *
     * @since 0.1.1
     */
    private final String value;

    /**
     * 詳細情報
     *
     * @since 0.1.1
     */
    private final String detail;

    /**
     * デフォルトの種類を返す<br>
     *
     * @since 0.1.1
     *
     * @return デフォルト値
     */
    public static KmgToolCliGenMsgTypes getDefault() {

        final KmgToolCliGenMsgTypes result = NONE;
        return result;

    }

    /**
     * キーに該当する種類を返す<br>
     * <p>
     * 但し、キーが存在しない場合は、指定無し（NONE）を返す。
     * </p>
     *
     * @since 0.1.1
     *
     * @param key
     *            キー
     *
     * @return 種類。指定無し（NONE）：キーが存在しない場合。
     */
    public static KmgToolCliGenMsgTypes getEnum(final String key) {

        KmgToolCliGenMsgTypes result = KmgToolCliGenMsgTypes.VALUES_MAP.get(key);

        if (result == null) {

            result = NONE;

        }
        return result;

    }

    /**
     * 初期値の種類を返す<br>
     *
     * @since 0.1.1
     *
     * @return 初期値
     */
    public static KmgToolCliGenMsgTypes getInitValue() {

        final KmgToolCliGenMsgTypes result = NONE;
        return result;

    }

    /**
     * コンストラクタ<br>
     *
     * @since 0.1.1
     *
     * @param displayName
     *                    表示名
     */
    KmgToolCliGenMsgTypes(final String displayName) {

        this.displayName = displayName;
        this.key = super.name();
        this.value = displayName;
        this.detail = displayName;

    }

    /**
     * メッセージのキーを返す。<br>
     *
     * @since 0.1.1
     *
     * @return メッセージのキー
     *
     * @see #getKey()
     */
    @Override
    public String get() {

        final String result = this.getKey();
        return result;

    }

    /**
     * メッセージのキーを返す。<br>
     *
     * @since 0.1.1
     *
     * @return メッセージのキー
     *
     * @see #getKey()
     */
    @Override
    public String getCode() {

        final String result = this.getKey();
        return result;

    }

    /**
     * 詳細情報を返す。<br>
     *
     * @since 0.1.1
     *
     * @return 詳細情報
     */
    @Override
    public String getDetail() {

        final String result = this.detail;
        return result;

    }

    /**
     * 表示名を返す。<br>
     * <p>
     * 識別するための表示名を返す。
     * </p>
     *
     * @since 0.1.1
     *
     * @return 表示名
     */
    @Override
    public String getDisplayName() {

        final String result = this.displayName;
        return result;

    }

    /**
     * メッセージのキーを返す。<br>
     *
     * @since 0.1.1
     *
     * @return メッセージのキー
     */
    @Override
    public String getKey() {

        final String result = this.key;
        return result;

    }

    /**
     * メッセージの値を返す。
     *
     * @since 0.1.1
     *
     * @return メッセージの値
     */
    @Override
    public String getValue() {

        final String result = this.value;
        return result;

    }

    /**
     * メッセージのキーを返す。<br>
     *
     * @since 0.1.1
     *
     * @return メッセージのキー
     *
     * @see #getKey()
     */
    @Override
    public String toString() {

        final String result = this.getKey();
        return result;

    }

}
