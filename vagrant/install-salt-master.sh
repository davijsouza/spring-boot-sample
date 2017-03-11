#!/bin/sh
yum install -y https://repo.saltstack.com/yum/redhat/salt-repo-latest-1.el6.noarch.rpm
yum install -y epel-release
yum install -y salt-master salt-api
adduser -M salt
echo salt | passwd salt --stdin
echo $1 > /etc/salt/master_id
cp /home/vagrant/resource/salt-master/api.conf /etc/salt/master.d/api.conf
cp /home/vagrant/resource/salt-master/eauth.conf /etc/salt/master.d/eauth.conf
chkconfig salt-master on
chkconfig salt-api on
service salt-master start
service salt-api start
