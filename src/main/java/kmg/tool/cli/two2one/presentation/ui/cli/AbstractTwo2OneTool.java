package kmg.tool.cli.two2one.presentation.ui.cli;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import kmg.core.infrastructure.utils.KmgPathUtils;
import kmg.fund.infrastructure.context.KmgMessageSource;
import kmg.tool.base.cmn.infrastructure.exception.KmgToolBaseMsgException;
import kmg.tool.base.two2one.domain.service.Two2OneService;
import kmg.tool.cli.cmn.infrastructure.types.KmgToolCliLogMsgTypes;
import kmg.tool.cli.io.presentation.ui.cli.AbstractIoTool;

/**
 * シンプル2入力ファイルから1出力ファイルへの変換ツールサービス抽象クラス
 *
 * @author KenichiroArai
 *
 * @since 0.1.0
 *
 * @version 0.1.3
 */
public abstract class AbstractTwo2OneTool extends AbstractIoTool {

    /**
     * テンプレートファイルのパスのフォーマット
     *
     * @since 0.1.0
     */
    private static final String TEMPLATE_FILE_PATH_FORMAT = "template/%s.yml"; //$NON-NLS-1$

    /**
     * メッセージソース
     *
     * @since 0.1.0
     */
    @Autowired
    private KmgMessageSource messageSource;

    /**
     * ロガー
     *
     * @since 0.1.0
     */
    private final Logger logger;

    /**
     * テンプレートファイルパス
     *
     * @since 0.1.0
     */
    private final Path templatePath;

    /**
     * 標準ロガーを使用して初期化するコンストラクタ<br>
     *
     * @since 0.1.0
     *
     * @param toolName
     *                 ツール名
     */
    public AbstractTwo2OneTool(final String toolName) {

        this(LoggerFactory.getLogger(AbstractTwo2OneTool.class), toolName);

    }

    /**
     * カスタムロガーを使用して初期化するコンストラクタ<br>
     *
     * @since 0.1.0
     *
     * @param logger
     *                 ロガー
     * @param toolName
     *                 ツール名
     */
    protected AbstractTwo2OneTool(final Logger logger, final String toolName) {

        super(toolName);
        this.logger = logger;
        this.templatePath = this.getDefaultTemplatePath();

    }

    /**
     * テンプレートファイルパス
     *
     * @since 0.1.0
     *
     * @return テンプレートファイルパス
     */
    public Path getTemplatePath() {

        final Path result = this.templatePath;
        return result;

    }

    /**
     * 初期化する
     *
     * @since 0.1.0
     *
     * @return true：成功、false：失敗
     */
    public boolean initialize() {

        boolean result;

        try {

            // TODO KenichiroArai 2026/01/27 一時的対応
            this.logger.info("-----#####*********-----AbstractTwo2OneTool.initialize START-----#####*********-----"); //$NON-NLS-1$

            final Two2OneService ioService = this.getIoService();

            // TODO KenichiroArai 2026/01/27 一時的対応
            this.logger.info("-----#####*********-----AbstractTwo2OneTool.initialize ioService----#####*********-----"); //$NON-NLS-1$

            if (ioService == null) {

                // TODO KenichiroArai 2026/01/27 一時的対応
                // ログの出力
                final KmgToolCliLogMsgTypes logType     = KmgToolCliLogMsgTypes.NONE;
                final Object[]              messageArgs = {};
                final String                msg         = this.messageSource.getLogMessage(logType, messageArgs);
                this.logger.error(msg + " IoServiceがnullです。"); //$NON-NLS-1$

                result = false;
                return result;

            }

            result = ioService.initialize(AbstractIoTool.getInputPath(), this.getTemplatePath(),
                AbstractIoTool.getOutputPath());

        } catch (final KmgToolBaseMsgException e) {

            // ログの出力
            final KmgToolCliLogMsgTypes logType     = KmgToolCliLogMsgTypes.KMGTOOLCLI_LOG17000;
            final Object[]              messageArgs = {};
            final String                msg         = this.messageSource.getLogMessage(logType, messageArgs);
            this.logger.error(msg, e);

            result = false;

        }

        // TODO KenichiroArai 2026/01/27 一時的対応
        this.logger.info("-----#####*********-----AbstractTwo2OneTool.initialize END----#####*********-----"); //$NON-NLS-1$

        return result;

    }

    /**
     * 2入力ファイルから1出力ファイルへの変換ツールサービスを返す。
     *
     * @since 0.1.0
     *
     * @return 2入力ファイルから1出力ファイルへの変換ツールサービス
     */
    @Override
    protected abstract Two2OneService getIoService();

    /**
     * デフォルトテンプレートパスを返す。
     *
     * @since 0.1.0
     *
     * @return デフォルトテンプレートパス
     */
    private Path getDefaultTemplatePath() {

        Path         result;
        final String className        = KmgPathUtils.getSimpleClassName(this.getClass());
        final String templateFileName = String.format(AbstractTwo2OneTool.TEMPLATE_FILE_PATH_FORMAT, className);

        // 優先パスがあれば採用する
        final Path primaryPath = Paths.get(AbstractIoTool.getPrimaryBasePath().toString(), templateFileName);

        if (primaryPath.toFile().exists()) {

            result = primaryPath;
            return result;

        }

        // 優先パスがないため、代替パスを採用する
        final Path secondaryPath = Paths.get(AbstractIoTool.getSecondaryBasePath().toString(), templateFileName);
        result = secondaryPath;

        return result;

    }

}
