package services;  //各Serviceクラスのスーパークラス

import javax.persistence.EntityManager;

import Utils.DBUtil;

/**
 * DB接続に関わる共通処理を行うクラス
 */
public class ServiceBase {

    /**
     * EntityManagerインスタンス
     */
    protected EntityManager em = DBUtil.createEntityManager();

    /**
     * EntityManagerのクローズ
     */
    public void close() {
        if (em.isOpen()) {
            em.close();
        }
    }
}