
CREATE TABLE IF NOT EXISTS config(
  `id` INTEGER auto_increment PRIMARY KEY,
  `site_name` varchar(20) DEFAULT NULL,
  `git` varchar(255) DEFAULT NULL,
  `hexo` varchar(255) DEFAULT NULL,
  `site_path` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS article (
  `id` INTEGER AUTO_INCREMENT PRIMARY KEY ,
  `title` varchar(255) NOT NULL DEFAULT '',
  `category` varchar(20) DEFAULT NULL,
  `tag` varchar(20) DEFAULT NULL,
  `content` text NOT NULL,
  `type` int(11) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8;