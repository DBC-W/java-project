package Architecture;

import Architecture.Controller.IInputManager;
import Architecture.Controller.IPanelManager;
import Architecture.Controller.InputManager;
import Architecture.Controller.PanelManager;
import Architecture.Modle.DataBaseModle;
import Architecture.Modle.IDataBaseModle;
import Tool.framework.Abstract.AbstractArchitecture;

/**
 * 此项目的框架
 */
public class MyAcrchitecture extends AbstractArchitecture {

    /* 单例实现 */
    private static MyAcrchitecture _instance;

    public static MyAcrchitecture Instance() {
        if (_instance == null)
            _instance = new MyAcrchitecture();
        return _instance;
    }

    private MyAcrchitecture() {
        super();
    }

    @Override
    protected void Init() {
        /* 面板控制器 */
        this.RegisterController(IPanelManager.class, new PanelManager());
        /* 控制台输入输出控制器 */
        this.RegisterController(IInputManager.class, new InputManager());
        /* 数据库模型 */
        this.RegisterModle(IDataBaseModle.class, new DataBaseModle());
    }
}
