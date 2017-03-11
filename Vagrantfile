Vagrant.configure("2") do |config|
  config.landrush.tld = "xuguruogu.com"
  config.landrush.enabled = true
  config.vm.synced_folder '.', '/vagrant', type: "virtualbox"
  config.vm.box = "centos/6"
  config.vm.provision "file", source: "./vagrant", destination: "/home/vagrant/resource"

  config.vm.define "salt-master" do |master|
    master.vm.hostname = 'master.xuguruogu.com'
    master.vm.network "private_network", ip: "192.168.88.101"
    master.vm.provision :shell, :path => "vagrant/install-salt-master.sh", :args => "salt-master"
  end
 
  config.vm.define "minion" do |proxy|
    proxy.vm.hostname = 'minion.xuguruogu.com'
    proxy.vm.network "private_network", ip: "192.168.88.102"
    proxy.vm.provision :shell, :path => "vagrant/install-supervisor.sh"
    proxy.vm.provision :shell, :path => "vagrant/install-salt-minion.sh", :args => "minion-proxy"
  end
end
