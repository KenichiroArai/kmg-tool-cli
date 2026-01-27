package kmg.tool.cli.cmn.infrastructure.types;

import java.util.HashMap;
import java.util.Map;

import kmg.tool.cli.cmn.infrastructure.msg.KmgToolCliCmnLogMsg;

/**
 * KMGツールCLIログメッセージの種類<br>
 * <p>
 * Msgは、Messageの略。
 * </p>
 *
 * @author KenichiroArai
 *
 * @since 0.1.1
 *
 * @version 0.1.3
 */
@SuppressWarnings("nls")
public enum KmgToolCliLogMsgTypes implements KmgToolCliCmnLogMsg {

    /* 定義：開始 */

    /**
     * 指定無し
     *
     * @since 0.1.1
     */
    NONE("指定無し"),

    /**
     * 初期化の失敗
     *
     * @since 0.1.3
     */
    KMGTOOLCLI_LOG15000("初期化の失敗"),

    /**
     * 初期化で例外が発生しました。
     *
     * @since 0.1.3
     */
    KMGTOOLCLI_LOG15001("初期化で例外が発生しました。"),

    /**
     * 初期化の失敗
     *
     * @since 0.1.3
     */
    KMGTOOLCLI_LOG17000("初期化の失敗"),

    /* 定義：終了 */
    ;

    /**
     * 種類のマップ
     *
     * @since 0.1.1
     */
    private static final Map<String, KmgToolCliLogMsgTypes> VALUES_MAP = new HashMap<>();

    static {

        /* 種類のマップにプット */
        for (final KmgToolCliLogMsgTypes type : KmgToolCliLogMsgTypes.values()) {

            KmgToolCliLogMsgTypes.VALUES_MAP.put(type.get(), type);

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
    public static KmgToolCliLogMsgTypes getDefault() {

        final KmgToolCliLogMsgTypes result = NONE;
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
    public static KmgToolCliLogMsgTypes getEnum(final String key) {

        KmgToolCliLogMsgTypes result = KmgToolCliLogMsgTypes.VALUES_MAP.get(key);

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
    public static KmgToolCliLogMsgTypes getInitValue() {

        final KmgToolCliLogMsgTypes result = NONE;
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
    KmgToolCliLogMsgTypes(final String displayName) {

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
