package cn.kerninventor.excel.core;

import cn.kerninventor.excel.core.user.elements.range.Row;
import cn.kerninventor.excel.core.user.elements.suspension.Anchor;
import cn.kerninventor.excel.core.user.elements.suspension.Picture;
import cn.kerninventor.excel.core.user.elements.suspension.TextBox;

/**
 * <p>
 *
 * </p>
 *
 * @author Kern
 */
@TextBox(
        value = "提示:",
        anchorIndex = {1,1,1,1}
)
@Picture(
        value = "base64://dsasd",
        anchorIndex = {1,1,1,1}
)
public class AttachedTemplate {
}
