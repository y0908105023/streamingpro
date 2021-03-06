package streaming.dsl.mmlib.algs

import ml.dmlc.xgboost4j.scala.spark.{TrackerConf, WowXGBoostClassifier, XGBoostClassificationModel}


/**
  * Created by allwefantasy on 12/9/2018.
  */
class XGBoostExt {
  def WowXGBoostClassifier = {
    val xgboost = new WowXGBoostClassifier()
    xgboost.set(xgboost.trackerConf, new TrackerConf(0, "scala"))
    xgboost
  }

  def load(tempPath: String) = {
    XGBoostClassificationModel.load(tempPath)
  }
}
