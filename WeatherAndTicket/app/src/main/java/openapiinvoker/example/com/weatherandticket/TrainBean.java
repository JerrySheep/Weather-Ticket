package openapiinvoker.example.com.weatherandticket;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yanhao on 2018/3/13.
 */

public class TrainBean implements Serializable{

    /**
     * reason : 查询成功
     * result : {"list":[{"train_no":"D2244","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"06:43","end_time":"09:00","run_time":"2小时17分","price_list":[{"price_type":"二等座","price":"96.5"},{"price_type":"一等座","price":"116.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D1804","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"06:53","end_time":"09:29","run_time":"2小时36分","price_list":[{"price_type":"二等座","price":"96.0"},{"price_type":"一等座","price":"120.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D638","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"07:12","end_time":"09:19","run_time":"2小时7分","price_list":[{"price_type":"二等座","price":"96.5"},{"price_type":"一等座","price":"116.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D1808","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"07:18","end_time":"09:36","run_time":"2小时18分","price_list":[{"price_type":"二等座","price":"96.0"},{"price_type":"一等座","price":"120.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D2224","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"07:36","end_time":"09:51","run_time":"2小时15分","price_list":[{"price_type":"二等座","price":"96.5"},{"price_type":"一等座","price":"116.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8501","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"沙坪坝","end_station_type":"终","start_time":"07:41","end_time":"09:24","run_time":"1小时43分","price_list":[{"price_type":"二等座","price":"144.5"},{"price_type":"一等座","price":"231.0"},{"price_type":"商务座","price":"433.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D1812","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"07:54","end_time":"10:05","run_time":"2小时11分","price_list":[{"price_type":"二等座","price":"96.0"},{"price_type":"一等座","price":"120.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D954","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"08:00","end_time":"09:56","run_time":"1小时56分","price_list":[{"price_type":"二等座","price":"96.5"},{"price_type":"一等座","price":"116.0"},{"price_type":"动卧","price":"190"},{"price_type":"高级动卧","price":"320"},{"price_type":"无座","price":"96.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D354","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"08:11","end_time":"10:08","run_time":"1小时57分","price_list":[{"price_type":"二等座","price":"96.5"},{"price_type":"一等座","price":"116.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D2208","train_type":"D","start_station":"成都","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"08:15","end_time":"10:32","run_time":"2小时17分","price_list":[{"price_type":"二等座","price":"97.0"},{"price_type":"一等座","price":"116.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8651","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"08:30","end_time":"09:47","run_time":"1小时17分","price_list":[{"price_type":"二等座","price":"146.0"},{"price_type":"一等座","price":"233.5"},{"price_type":"商务座","price":"438.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D2256","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"08:31","end_time":"10:39","run_time":"2小时8分","price_list":[{"price_type":"二等座","price":"96.5"},{"price_type":"一等座","price":"116.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8701","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"08:37","end_time":"10:10","run_time":"1小时33分","price_list":[{"price_type":"二等座","price":"154.0"},{"price_type":"一等座","price":"246.5"},{"price_type":"商务座","price":"462.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D1816","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"08:41","end_time":"10:48","run_time":"2小时7分","price_list":[{"price_type":"二等座","price":"96.0"},{"price_type":"一等座","price":"120.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D364","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"08:55","end_time":"10:52","run_time":"1小时57分","price_list":[{"price_type":"二等座","price":"96.5"},{"price_type":"一等座","price":"116.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8503","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"沙坪坝","end_station_type":"终","start_time":"09:03","end_time":"10:45","run_time":"1小时42分","price_list":[{"price_type":"二等座","price":"144.5"},{"price_type":"一等座","price":"231.0"},{"price_type":"特等座","price":"261.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D2264","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"09:05","end_time":"11:00","run_time":"1小时55分","price_list":[{"price_type":"二等座","price":"96.5"},{"price_type":"一等座","price":"116.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"K194","train_type":"K","start_station":"成都","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"09:05","end_time":"13:56","run_time":"4小时51分","price_list":[{"price_type":"硬座","price":"46.5"},{"price_type":"硬卧","price":"100.5"},{"price_type":"软卧","price":"159.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D2238","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"09:11","end_time":"11:23","run_time":"2小时12分","price_list":[{"price_type":"二等座","price":"96.5"},{"price_type":"一等座","price":"116.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D1820","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"09:17","end_time":"11:35","run_time":"2小时18分","price_list":[{"price_type":"二等座","price":"96.0"},{"price_type":"一等座","price":"120.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D2374","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"09:29","end_time":"11:53","run_time":"2小时24分","price_list":[{"price_type":"二等座","price":"96.5"},{"price_type":"一等座","price":"116.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8653","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"09:41","end_time":"11:06","run_time":"1小时25分","price_list":[{"price_type":"二等座","price":"146.0"},{"price_type":"一等座","price":"233.5"},{"price_type":"商务座","price":"438.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8751","train_type":"G","start_station":"成都东","start_station_type":"过","end_station":"重庆北","end_station_type":"终","start_time":"09:50","end_time":"11:26","run_time":"1小时36分","price_list":[{"price_type":"二等座","price":"154.0"},{"price_type":"一等座","price":"246.5"},{"price_type":"商务座","price":"462.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8505","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"终","start_time":"10:02","end_time":"11:43","run_time":"1小时41分","price_list":[{"price_type":"二等座","price":"154.0"},{"price_type":"一等座","price":"246.5"},{"price_type":"商务座","price":"462.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D2260","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"10:20","end_time":"12:21","run_time":"2小时1分","price_list":[{"price_type":"二等座","price":"96.5"},{"price_type":"一等座","price":"116.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8507","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"沙坪坝","end_station_type":"终","start_time":"10:33","end_time":"12:15","run_time":"1小时42分","price_list":[{"price_type":"二等座","price":"144.5"},{"price_type":"一等座","price":"231.0"},{"price_type":"商务座","price":"433.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D1824","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"10:39","end_time":"12:59","run_time":"2小时20分","price_list":[{"price_type":"二等座","price":"96.0"},{"price_type":"一等座","price":"120.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8705","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"10:51","end_time":"12:39","run_time":"1小时48分","price_list":[{"price_type":"二等座","price":"154.0"},{"price_type":"一等座","price":"246.5"},{"price_type":"商务座","price":"462.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D368","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"10:55","end_time":"13:04","run_time":"2小时9分","price_list":[{"price_type":"二等座","price":"96.5"},{"price_type":"一等座","price":"116.0"},{"price_type":"无座","price":"96.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D1785","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"11:13","end_time":"13:11","run_time":"1小时58分","price_list":[{"price_type":"二等座","price":"121.0"},{"price_type":"一等座","price":"193.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8509","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"终","start_time":"11:30","end_time":"13:04","run_time":"1小时34分","price_list":[{"price_type":"二等座","price":"154.0"},{"price_type":"一等座","price":"246.5"},{"price_type":"特等座","price":"279.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"Z50","train_type":"Z","start_station":"成都","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"11:42","end_time":"14:36","run_time":"2小时54分","price_list":[{"price_type":"硬座","price":"46.5"},{"price_type":"硬卧","price":"107"},{"price_type":"软卧","price":"159.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8511","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"终","start_time":"11:52","end_time":"13:26","run_time":"1小时34分","price_list":[{"price_type":"二等座","price":"154.0"},{"price_type":"一等座","price":"246.5"},{"price_type":"商务座","price":"462.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8513","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"沙坪坝","end_station_type":"终","start_time":"11:58","end_time":"13:32","run_time":"1小时34分","price_list":[{"price_type":"二等座","price":"144.5"},{"price_type":"一等座","price":"231.0"},{"price_type":"商务座","price":"433.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"K504","train_type":"K","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"12:01","end_time":"15:42","run_time":"3小时41分","price_list":[{"price_type":"硬座","price":"46.5"},{"price_type":"硬卧","price":"100.5"},{"price_type":"软卧","price":"146.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8655","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"12:16","end_time":"13:42","run_time":"1小时26分","price_list":[{"price_type":"二等座","price":"146.0"},{"price_type":"一等座","price":"233.5"},{"price_type":"商务座","price":"438.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8515","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"终","start_time":"12:28","end_time":"14:15","run_time":"1小时47分","price_list":[{"price_type":"二等座","price":"154.0"},{"price_type":"一等座","price":"246.5"},{"price_type":"特等座","price":"279.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D1825","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"12:48","end_time":"14:48","run_time":"2小时0分","price_list":[{"price_type":"二等座","price":"121.0"},{"price_type":"一等座","price":"193.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"K488","train_type":"K","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"13:00","end_time":"16:17","run_time":"3小时17分","price_list":[{"price_type":"硬座","price":"46.5"},{"price_type":"硬卧","price":"100.5"},{"price_type":"软卧","price":"159.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8709","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"13:07","end_time":"14:48","run_time":"1小时41分","price_list":[{"price_type":"二等座","price":"154.0"},{"price_type":"一等座","price":"246.5"},{"price_type":"商务座","price":"462.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D1829","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"13:23","end_time":"15:21","run_time":"1小时58分","price_list":[{"price_type":"二等座","price":"121.0"},{"price_type":"一等座","price":"193.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D634","train_type":"D","start_station":"成都","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"13:33","end_time":"15:52","run_time":"2小时19分","price_list":[{"price_type":"二等座","price":"97.0"},{"price_type":"一等座","price":"116.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8517","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"沙坪坝","end_station_type":"终","start_time":"13:35","end_time":"15:03","run_time":"1小时28分","price_list":[{"price_type":"二等座","price":"144.5"},{"price_type":"一等座","price":"231.0"},{"price_type":"特等座","price":"261.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8519","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"沙坪坝","end_station_type":"终","start_time":"13:49","end_time":"15:24","run_time":"1小时35分","price_list":[{"price_type":"二等座","price":"144.5"},{"price_type":"一等座","price":"231.0"},{"price_type":"商务座","price":"433.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8657","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"14:08","end_time":"15:34","run_time":"1小时26分","price_list":[{"price_type":"二等座","price":"146.0"},{"price_type":"一等座","price":"233.5"},{"price_type":"商务座","price":"438.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D1833","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"14:14","end_time":"16:12","run_time":"1小时58分","price_list":[{"price_type":"二等座","price":"121.0"},{"price_type":"一等座","price":"193.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8521","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"终","start_time":"14:25","end_time":"16:06","run_time":"1小时41分","price_list":[{"price_type":"二等座","price":"154.0"},{"price_type":"一等座","price":"246.5"},{"price_type":"商务座","price":"462.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"K874","train_type":"K","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"14:43","end_time":"17:47","run_time":"3小时4分","price_list":[{"price_type":"硬座","price":"46.5"},{"price_type":"硬卧","price":"100.5"},{"price_type":"软卧","price":"159.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8713","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"15:00","end_time":"16:26","run_time":"1小时26分","price_list":[{"price_type":"二等座","price":"154.0"},{"price_type":"一等座","price":"246.5"},{"price_type":"商务座","price":"462.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G2887","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"15:06","end_time":"16:44","run_time":"1小时38分","price_list":[{"price_type":"二等座","price":"146.0"},{"price_type":"一等座","price":"233.5"},{"price_type":"特等座","price":"264.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8523","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"沙坪坝","end_station_type":"终","start_time":"15:21","end_time":"17:03","run_time":"1小时42分","price_list":[{"price_type":"二等座","price":"144.5"},{"price_type":"一等座","price":"231.0"},{"price_type":"特等座","price":"261.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8717","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"15:49","end_time":"17:30","run_time":"1小时41分","price_list":[{"price_type":"二等座","price":"154.0"},{"price_type":"一等座","price":"246.5"},{"price_type":"特等座","price":"279.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"K652","train_type":"K","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"15:50","end_time":"19:42","run_time":"3小时52分","price_list":[{"price_type":"硬座","price":"46.5"},{"price_type":"硬卧","price":"100.5"},{"price_type":"软卧","price":"146.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G2163","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"16:01","end_time":"17:33","run_time":"1小时32分","price_list":[{"price_type":"二等座","price":"146.0"},{"price_type":"一等座","price":"233.5"},{"price_type":"特等座","price":"264.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G2889","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"16:10","end_time":"17:43","run_time":"1小时33分","price_list":[{"price_type":"二等座","price":"146.0"},{"price_type":"一等座","price":"233.5"},{"price_type":"特等座","price":"264.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8525","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"终","start_time":"16:18","end_time":"17:59","run_time":"1小时41分","price_list":[{"price_type":"二等座","price":"154.0"},{"price_type":"一等座","price":"246.5"},{"price_type":"商务座","price":"462.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8527","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"沙坪坝","end_station_type":"终","start_time":"16:32","end_time":"18:14","run_time":"1小时42分","price_list":[{"price_type":"二等座","price":"144.5"},{"price_type":"一等座","price":"231.0"},{"price_type":"商务座","price":"433.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8721","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"17:07","end_time":"18:49","run_time":"1小时42分","price_list":[{"price_type":"二等座","price":"154.0"},{"price_type":"一等座","price":"246.5"},{"price_type":"商务座","price":"462.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8659","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"17:13","end_time":"18:45","run_time":"1小时32分","price_list":[{"price_type":"二等座","price":"146.0"},{"price_type":"一等座","price":"233.5"},{"price_type":"商务座","price":"438.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8529","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"终","start_time":"17:23","end_time":"19:03","run_time":"1小时40分","price_list":[{"price_type":"二等座","price":"154.0"},{"price_type":"一等座","price":"246.5"},{"price_type":"特等座","price":"279.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8531","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"沙坪坝","end_station_type":"终","start_time":"17:52","end_time":"19:34","run_time":"1小时42分","price_list":[{"price_type":"二等座","price":"144.5"},{"price_type":"一等座","price":"231.0"},{"price_type":"特等座","price":"261.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"K588","train_type":"K","start_station":"成都","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"17:52","end_time":"21:50","run_time":"3小时58分","price_list":[{"price_type":"硬座","price":"46.5"},{"price_type":"硬卧","price":"100.5"},{"price_type":"软卧","price":"146.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8533","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"沙坪坝","end_station_type":"终","start_time":"18:13","end_time":"19:56","run_time":"1小时43分","price_list":[{"price_type":"二等座","price":"144.5"},{"price_type":"一等座","price":"231.0"},{"price_type":"商务座","price":"433.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G1709","train_type":"G","start_station":"成都东","start_station_type":"过","end_station":"重庆西","end_station_type":"终","start_time":"18:20","end_time":"19:54","run_time":"1小时34分","price_list":[{"price_type":"二等座","price":"146.0"},{"price_type":"一等座","price":"233.5"},{"price_type":"商务座","price":"438.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D5102","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"18:36","end_time":"20:46","run_time":"2小时10分","price_list":[{"price_type":"二等座","price":"96.5"},{"price_type":"一等座","price":"116.0"},{"price_type":"无座","price":"96.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G1975","train_type":"G","start_station":"成都东","start_station_type":"过","end_station":"重庆西","end_station_type":"终","start_time":"18:43","end_time":"20:09","run_time":"1小时26分","price_list":[{"price_type":"二等座","price":"146.0"},{"price_type":"一等座","price":"233.5"},{"price_type":"商务座","price":"438.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"D5104","train_type":"D","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"终","start_time":"18:52","end_time":"21:09","run_time":"2小时17分","price_list":[{"price_type":"二等座","price":"96.0"},{"price_type":"一等座","price":"120.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8663","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"过","start_time":"18:56","end_time":"20:29","run_time":"1小时33分","price_list":[{"price_type":"二等座","price":"146.0"},{"price_type":"一等座","price":"233.5"},{"price_type":"商务座","price":"438.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"K578","train_type":"K","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"过","start_time":"19:00","end_time":"22:16","run_time":"3小时16分","price_list":[{"price_type":"硬座","price":"46.5"},{"price_type":"硬卧","price":"100.5"},{"price_type":"软卧","price":"159.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G571","train_type":"G","start_station":"成都东","start_station_type":"过","end_station":"重庆西","end_station_type":"终","start_time":"19:19","end_time":"20:56","run_time":"1小时37分","price_list":[{"price_type":"二等座","price":"146.0"},{"price_type":"一等座","price":"233.5"},{"price_type":"商务座","price":"438.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8535","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"终","start_time":"19:36","end_time":"21:17","run_time":"1小时41分","price_list":[{"price_type":"二等座","price":"154.0"},{"price_type":"一等座","price":"246.5"},{"price_type":"商务座","price":"462.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8537","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"终","start_time":"19:52","end_time":"21:39","run_time":"1小时47分","price_list":[{"price_type":"二等座","price":"154.0"},{"price_type":"一等座","price":"246.5"},{"price_type":"特等座","price":"279.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"C6001","train_type":"C","start_station":"成都东","start_station_type":"始","end_station":"重庆西","end_station_type":"终","start_time":"20:12","end_time":"22:11","run_time":"1小时59分","price_list":[{"price_type":"二等座","price":"121.0"},{"price_type":"一等座","price":"193.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G1835","train_type":"G","start_station":"成都东","start_station_type":"过","end_station":"重庆西","end_station_type":"终","start_time":"20:57","end_time":"22:31","run_time":"1小时34分","price_list":[{"price_type":"二等座","price":"146.0"},{"price_type":"一等座","price":"233.5"},{"price_type":"商务座","price":"438.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8541","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"终","start_time":"21:04","end_time":"22:45","run_time":"1小时41分","price_list":[{"price_type":"二等座","price":"154.0"},{"price_type":"一等座","price":"246.5"},{"price_type":"商务座","price":"462.5"}],"run_distance":"","m_chaxun_url":""},{"train_no":"C6003","train_type":"C","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"终","start_time":"21:33","end_time":"23:33","run_time":"2小时0分","price_list":[{"price_type":"二等座","price":"128.0"},{"price_type":"一等座","price":"204.0"}],"run_distance":"","m_chaxun_url":""},{"train_no":"G8543","train_type":"G","start_station":"成都东","start_station_type":"始","end_station":"重庆北","end_station_type":"终","start_time":"21:42","end_time":"23:15","run_time":"1小时33分","price_list":[{"price_type":"二等座","price":"154.0"},{"price_type":"一等座","price":"246.5"},{"price_type":"商务座","price":"462.5"}],"run_distance":"","m_chaxun_url":""}]}
     * error_code : 0
     */

    public String reason;
    public ResultBean result;
    public int error_code;

    public static class ResultBean implements Serializable{
        public List<ListBean> list;

        public static class ListBean implements Serializable{
            /**
             * train_no : D2244
             * train_type : D
             * start_station : 成都东
             * start_station_type : 始
             * end_station : 重庆北
             * end_station_type : 过
             * start_time : 06:43
             * end_time : 09:00
             * run_time : 2小时17分
             * price_list : [{"price_type":"二等座","price":"96.5"},{"price_type":"一等座","price":"116.0"}]
             * run_distance :
             * m_chaxun_url :
             */

            public String train_no;
            public String train_type;
            public String start_station;
            public String start_station_type;
            public String end_station;
            public String end_station_type;
            public String start_time;
            public String end_time;
            public String run_time;
            public String run_distance;
            public String m_chaxun_url;
            public List<PriceListBean> price_list;

            public static class PriceListBean implements Serializable{
                /**
                 * price_type : 二等座
                 * price : 96.5
                 */

                public String price_type;
                public String price;

                public String getPrice_type() {
                    return price_type;
                }

                public void setPrice_type(String price_type) {
                    this.price_type = price_type;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }
            }

            public String getTrain_no() {
                return train_no;
            }

            public void setTrain_no(String train_no) {
                this.train_no = train_no;
            }

            public String getTrain_type() {
                return train_type;
            }

            public void setTrain_type(String train_type) {
                this.train_type = train_type;
            }

            public String getStart_station() {
                return start_station;
            }

            public void setStart_station(String start_station) {
                this.start_station = start_station;
            }

            public String getStart_station_type() {
                return start_station_type;
            }

            public void setStart_station_type(String start_station_type) {
                this.start_station_type = start_station_type;
            }

            public String getEnd_station() {
                return end_station;
            }

            public void setEnd_station(String end_station) {
                this.end_station = end_station;
            }

            public String getEnd_station_type() {
                return end_station_type;
            }

            public void setEnd_station_type(String end_station_type) {
                this.end_station_type = end_station_type;
            }

            public String getStart_time() {
                return start_time;
            }

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getRun_time() {
                return run_time;
            }

            public void setRun_time(String run_time) {
                this.run_time = run_time;
            }

            public String getRun_distance() {
                return run_distance;
            }

            public void setRun_distance(String run_distance) {
                this.run_distance = run_distance;
            }

            public String getM_chaxun_url() {
                return m_chaxun_url;
            }

            public void setM_chaxun_url(String m_chaxun_url) {
                this.m_chaxun_url = m_chaxun_url;
            }
        }
    }
}
