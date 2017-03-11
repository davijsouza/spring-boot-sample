#!/bin/sh
yum install -y python-pip
pip install supervisor
pip install meld3==1.0.0
cp /home/vagrant/resource/minion-proxy/supervisord.conf /etc/supervisord.conf
cp /home/vagrant/resource/minion-proxy/supervisord /etc/rc.d/init.d/supervisord
chmod +x /etc/rc.d/init.d/supervisord
chkconfig --add supervisord
chkconfig supervisord on
service supervisord start
